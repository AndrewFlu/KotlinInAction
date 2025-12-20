package ch_09_operators.equals

class Point(val x: Int, val y:Int) {
    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is Point) return false
        return x == other.x && y == other.y
    }

    override fun hashCode(): Int {
        return x * 37 + y * 37
    }
}

fun main() {
    println(Point(10, 5) == Point(10, 5))
    println(Point(1, 2) != Point(5, 7))
    println(null == Point(1, 5))
}