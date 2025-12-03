package ch04_classes_interfaces.backing_fields

class User(val name: String) {
    var address: String = "unspecified"
        set(newValue: String) {
            println("""
                Address was changed for $name:
                "$field" -> "$newValue"
            """.trimIndent())
            field = newValue
        }
}

fun main() {
    val user = User("Robert")
    user.address = "USA, New-York 55"
}