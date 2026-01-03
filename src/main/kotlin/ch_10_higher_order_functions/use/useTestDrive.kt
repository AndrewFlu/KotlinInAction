package ch_10_higher_order_functions.use

import java.io.BufferedReader
import java.io.FileReader
import kotlin.io.path.Path
import kotlin.io.path.useLines

fun readFirstLine(file: String): String {
    BufferedReader(FileReader(file)).use { br -> // вызов use и передача лямбды для операции с файлом
        return br.readLine() // возврат строки из функци
    }
}

fun readFirstLineByUseLines(file: String): String {
    Path(file).useLines {
        return it.first() // it — последовательность строк из входного файла
    }
}

fun main() {
    val file = "src/main/resources/ForReadFirstLine.txt"
    println("First line into file [$file] by use(): ${readFirstLine(file)}")

    println("First line into file [$file] by useLines(): ${readFirstLineByUseLines(file)}")
}