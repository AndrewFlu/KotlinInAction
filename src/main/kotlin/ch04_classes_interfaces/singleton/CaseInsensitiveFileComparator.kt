package ch04_classes_interfaces.singleton

import java.io.File

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(file1: File, file2: File): Int {
        return file1.path.compareTo(file2.path, ignoreCase = true)
    }
}

fun main() {
    println(CaseInsensitiveFileComparator.compare(File("/Users/andrew"), File("/users/andrew")))
    println(CaseInsensitiveFileComparator.compare(File("/Users/andrew/Documents"), File("/users/andrew")))
}