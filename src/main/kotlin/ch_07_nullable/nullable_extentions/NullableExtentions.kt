package ch_07_nullable.nullable_extentions

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) // безопасный вызов для значения, допускающего null не требуется
        println("Please fill in the required fields")
    else
        println("User entered: $input")
}

fun main() {
    verifyUserInput("")
    verifyUserInput(null)
    verifyUserInput("Yo! Hi!")
}