package ch02.exceptions

import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        reader.close()
    }
}

fun readNumber2(reader: BufferedReader): Int {
    val line = reader.readLine()
    reader.close()

    return Integer.parseInt(line)
}

fun main() {
    val reader = BufferedReader(StringReader("12345"))
    val reader2 = BufferedReader(StringReader("notANumber"))
    println(readNumber(reader))
    println(readNumber2(reader2))
}