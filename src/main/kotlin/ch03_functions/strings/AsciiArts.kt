package ch03_functions.strings

val kotlinLogo = """
    |  //
    | //
    |//
    |/ \
""".trimIndent()

val expectedObject = """
    {
        "name": "Robert",
        "age":61,
        "homeTown": "Oklahoma"
    }
""".trimIndent()

// для корректной интерпретации Unicode требуется использовать синтаксис выражений
val thinkEmoji = """
    Hmm ${"\uD83E\uDD14"} 
""".trimIndent()

fun main() {
    println(kotlinLogo)
    println()
    println(expectedObject)
    println()
    println(thinkEmoji)
}