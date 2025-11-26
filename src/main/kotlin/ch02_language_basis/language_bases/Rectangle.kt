package ch02_language_basis.language_bases

class Rectangle (val width: Int, val height: Int) {
    val isSquare: Boolean
        get() {
            return width == height
        }
}