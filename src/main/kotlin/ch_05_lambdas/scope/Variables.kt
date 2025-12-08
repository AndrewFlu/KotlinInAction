package ch_05_lambdas.scope

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}

fun main() {
    val errors = listOf(
        "403 forbidden",
        "500 internal error"
    )
    printMessagesWithPrefix(errors, "Error:")
}