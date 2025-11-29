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

val thinkEmoji = """
    Hmm ${"\uD83E\uDD14"} // для корректной интерпретации Unicode требуется использовать синтаксис выражений
""".trimIndent()

fun main() {
    println(kotlinLogo)
    println()
    println(expectedObject)
    println()
    println(thinkEmoji)
}