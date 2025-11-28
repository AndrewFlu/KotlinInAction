package ch03_functions.parsing

fun parsePath(path: String) {
    // path: /Users/andrey/Documents/dev/projects/KotlinInActionHomeWork/pom.xml
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir: $directory, name: $fileName, ext: $extension")
}


fun main() {
    val path = "/Users/andrey/Documents/dev/projects/KotlinInActionHomeWork/pom.xml"
    parsePath(path)
}