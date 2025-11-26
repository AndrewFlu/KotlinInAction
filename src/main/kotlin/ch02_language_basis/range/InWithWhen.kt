package ch02_language_basis.range

fun recognize(c: Char) = when(c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z',
    in 'а'..'я', in 'А'..'Я'
        ,'ё' -> "It's a letter!"
    else -> "Hm.., it's a Stange char..."
}

fun main() {
    println(recognize('a'))
    println(recognize('5'))
    println(recognize('й'))
    println(recognize('ё'))
    println(recognize('е'))
}