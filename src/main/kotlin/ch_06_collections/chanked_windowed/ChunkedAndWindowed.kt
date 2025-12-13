package ch_06_collections.chanked_windowed

fun main() {
    val outcomes = listOf(550, 180, 450, 180, 470, 180)
    println("Траты за неделю в разрезе по дням: ${outcomes}")
    println("средние траты за 3 дня, скользящие по неделе: ${outcomes.windowed(3) { it.sum() / it.size }}")
    println("траты раз в 2 дня, в течение недели: ${outcomes.chunked(2) { it.sum() }}")
}