package basics

class Rectangle(var height: Int, width: Int) {
    var perimeter = height * width
}

fun main() {
    println("hello world!")
    var c: Int = 18
    var d = "Nithigna $c"
    var e: String;
    println(d)
    println(add(10, 20))
    var rectangle = Rectangle(5, 5)
    println(rectangle.perimeter)
}

fun add(a: Int, b: Int): Int {
    return a + b;
}