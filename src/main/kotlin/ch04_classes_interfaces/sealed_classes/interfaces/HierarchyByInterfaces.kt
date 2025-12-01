package ch04_classes_interfaces.sealed_classes.interfaces

interface Expr

class Num(val value: Int) : Expr

class Sum(val left: Int, val right: Int) : Expr

fun eval(e: Expr) : Int =
    when(e) {
        is Num -> e.value
        is Sum -> e.left + e.right
        else -> throw IllegalArgumentException("Unknown expression")
    }