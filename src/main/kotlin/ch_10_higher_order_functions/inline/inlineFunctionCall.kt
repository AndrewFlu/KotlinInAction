package ch_10_higher_order_functions.inline

import java.time.LocalDate
import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock


// тело функции, помеченнрй как inline подставляется в точки вызова функции
inline fun <T> synchronized(lock: Lock, action: () -> T): T {
    lock.lock()
    try {
        return action()
    } finally {
        lock.unlock()
    }
}

fun foo(lock: Lock) {
    println("Before sync")
    synchronized(lock, { println("action") }) // этот вызов превратится во встроенное тело функции synchronized()
    println("After sync")
}

class LockOwner(val lock: Lock) {
    fun runUnderLock(body: () -> Unit) {
        synchronized(lock, body) // в качестве аргумента передаётся переменная типа функции, а не лямбда
    }
}

fun main() {
    val lock = ReentrantLock()
    synchronized(lock) { println("Lambda") }
    println()
    foo(lock)
    println()
    val lockOwner = LockOwner(lock)
    val functionVariable = {
        println("Current time is ${LocalDate.now()}")
    }
    lockOwner.runUnderLock(functionVariable)
}