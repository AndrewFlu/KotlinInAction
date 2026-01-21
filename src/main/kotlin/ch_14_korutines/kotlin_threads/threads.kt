package ch_14_korutines.kotlin_threads

import kotlin.concurrent.thread

fun main() {
    println("This is a thread: ${Thread.currentThread().name}")
    // запуск нового потока, выполняющего заданный блок кода
    thread {
        println("This is a thread: ${Thread.currentThread().name}")
    }

}