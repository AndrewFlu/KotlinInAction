package ch_10_higher_order_functions.closures

data class Macbook(val model: String, val year: Int)


fun findMacbookPro(macbooks: List<Macbook>) {
    macbooks.forEach macbookLabel@{
        if (it.model != "MacBook Pro") return@macbookLabel
        println("'MacBook Pro' found!") // эта строка выполнится, если не выполнился возврат return@macbookLabel
    }
}

fun findMacbookAir(macbooks: List<Macbook>) {
    macbooks.forEach{
        if (it.model != "MacBook Air") return@forEach
        println("'MacBook Air' found!")
    }
}

fun main() {
    val macbooks = listOf(Macbook("MacBook Air", 2017), Macbook("MacBook Pro", 2019))
    findMacbookPro(macbooks)
    findMacbookAir(macbooks)
}