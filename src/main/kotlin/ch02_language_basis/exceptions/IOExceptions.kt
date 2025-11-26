package ch02_language_basis.exceptions

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
        null
    }

    println(number)
}


fun main() {
    // print correctly
    val reader = BufferedReader(StringReader("12345"))
    println(readNumber(reader))

    // print null
    val reader3 = BufferedReader(StringReader("NOT a number"))
    readNumber3(reader3)

    // throw exception
    val reader2 = BufferedReader(StringReader("notANumber"))
    println(readNumber2(reader2))
}