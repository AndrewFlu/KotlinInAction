package ch_05_lambdas.scope

fun printErrorCount(responses: Collection<String>) {
    // объявление переменных с доступом из лямбды
    var clientErrors = 0
    var serverErrors = 0

    responses.forEach {
        if (it.startsWith('4'))
            clientErrors++
        else
            serverErrors++
    }
    println("Client errors count: $clientErrors\n" +
            "Server errors count: $serverErrors\n")
}

fun main() {
    val responses = listOf(
        "403 forbidden",
        "500 internal error",
        "401 unauthorized"
    )
    printErrorCount(responses)
}