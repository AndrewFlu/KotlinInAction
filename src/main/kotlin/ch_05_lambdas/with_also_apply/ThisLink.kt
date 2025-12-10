
class OuterClass {

    fun alphabetOuter() = with(StringBuilder()) {
        for (letter in 'A'..'Z')
            append(letter)
        append("\nThi is shortest alphabet function\n")
        this@OuterClass.toString() + ":\n" +  toString()
    }

    override fun toString(): String {
        return "OuterClass version toString"
    }


}

fun main(){
    println(OuterClass().alphabetOuter())
}
