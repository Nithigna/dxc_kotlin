package collections

class AssociateBy {
}

data class Person(val name: String, val city: String, val phone: Int)

var people = listOf<Person>(
    Person("Nithigna", "Tirupati", 79897),
    Person("N", "Bangalore", 87819),
    Person("Example", "Bangalore", 81796)
)

fun main() {
    val phoneBook = people.associateBy { it.city }

    println(phoneBook)
}

