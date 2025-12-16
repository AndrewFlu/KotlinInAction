package ch_08_basic_types_collections_arrays.ints

fun showProgress(progress: Int) {
    val percent = progress.coerceIn(0, 100)
    println("Bonds rose up at ${percent}%!")
}

fun main() {
    showProgress(70)
    showProgress(110)
}