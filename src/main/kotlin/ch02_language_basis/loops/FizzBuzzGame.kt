package ch02_language_basis.loops

fun fizzBuzz(i: Int) =
    when {
        i % 15 == 0 -> "fizz-buzz"
        i % 3 == 0 -> "fizz"
        i % 5 == 0 -> "buzz"
        else -> "$i"
    }

fun main() {
    println("New Game (count up)")
    for (i in 1..30) {
        println(fizzBuzz(i))
    }

    println("New Game (count down)")
    for (i in 50 downTo 1 step 2) {
        println(fizzBuzz(i))
    }
}