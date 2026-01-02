package ch_10_higher_order_functions.inline

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

fun main() {
    val lock = ReentrantLock()
    synchronized(lock) { println("Lambda") }
    println()
    foo(lock)
}