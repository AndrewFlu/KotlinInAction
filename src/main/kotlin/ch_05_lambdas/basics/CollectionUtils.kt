package ch_05_lambdas.basics

fun findTheOldest(people: List<People>) {
    var maxAge = 0
    var theOldest: People? = null
    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}

fun main() {
    val colleagues = listOf(People("Mikle", 27), People("Viktor", 42), People("Sergey", 34))
    findTheOldest(colleagues)
}