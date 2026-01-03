package ch_10_higher_order_functions.use

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun readFirstLine(file: String): String {
    BufferedReader(FileReader(file)).use { br -> // вызов use и передача лямбды для операции с файлом
        return br.readLine() // возврат строки из функци
    }
}

fun main() {
    val file = "src/main/resources/ForReadFirstLine.txt"
    println("First line into file [$file]: ${readFirstLine(file)}")
}