package ch_06_collections.sequence

import java.io.File

fun File.isInsideHiddenDirectory() =
    generateSequence(this) { it.parentFile }.any { it.isHidden }

fun main() {
    val file = File("/Users/andrey/Documents/dev/projects/KotlinInActionHomeWork/.idea/compiler.xml")
    println(file.isInsideHiddenDirectory())
}