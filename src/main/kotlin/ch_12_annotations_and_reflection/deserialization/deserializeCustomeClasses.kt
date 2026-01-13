package ch_12_annotations_and_reflection.deserialization

inline fun <reified T: Any> deserialize(json: String): T {
    TODO()
}

data class Author(val name: String)
data class Book(val title: String, val author: Author)

fun main() {
    val json = """{
        "title": "Idiot",
        "author": {
            "name": "F.M. Dostoevsky"
        }
        }""".trimMargin()
    val book = deserialize<Book>(json)
    println(book)
}

