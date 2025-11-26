package ch02_language_basis.exceptions

fun validatePercent(number: Int) =
    if (number in 0..100)
        true
else
    throw IllegalArgumentException(
        "A percentage value must be between 0 and 100: $number"
    )

fun main(){
    val number = 111
    println("$number is a valid percent: ${validatePercent(number)}")
}