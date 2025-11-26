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

fun readNumber3(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }

    println(number)
}


fun main() {
    val reader = BufferedReader(StringReader("12345"))
    val reader2 = BufferedReader(StringReader("notANumber"))
    val reader3 = BufferedReader(StringReader("5"))
    println(readNumber(reader))
    println(readNumber3(reader3))
    println(readNumber2(reader2))
}