package ch_09_operators.delegates.observers

fun main() {
    val dima = Person("Dima Haritonov", 44, 250_000)

    // Создание объекта-наблююдателя с помощью сокращения, доступного
    // для интерфейсов fun, и его прикрепление в ожидании изменения свойства
    dima.observers += Observer {propName, oldValue, newValue ->
        println(
            """
                Property $propName changed from $oldValue to $newValue!
            """.trimIndent()
        )
    }
    dima.name = "Yaromir Baykhlozhmetch"
    dima.salary = 280_000
}