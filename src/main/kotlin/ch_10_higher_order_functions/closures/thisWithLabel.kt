package ch_10_higher_order_functions.closures

fun main() {
    val builder = StringBuilder().apply sb@{ // к этому скрытому приёмнику можно получить доступ с помощью выражения this@sb
        listOf(1, 2, 3, 4, 5).apply {
            // ссылка this указывает на ближайший скрытый приёмник в области видимости
            this@sb.append(this.toString()) // все скрытые приёмники доступны, а к скрытым можно обращаться только через явные метки
        }
    }
    println(builder)
}