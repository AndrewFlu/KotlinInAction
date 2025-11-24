package ch02.language_bases

class Rectangle (val width: Int, val height: Int) {
    val isSquare: Boolean
        get() {
            return width == height
        }
}