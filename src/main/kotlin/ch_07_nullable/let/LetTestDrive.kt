package ch_07_nullable.let

fun sendEmail(email: String) {
    println("Sent email to $email")
}

fun main() {
    val nullEmail: String? = null
    val defaultEmail: String? = "andrew@corp.ru"

    defaultEmail?.let { sendEmail(it) }
    nullEmail?.let { sendEmail(it) }
}