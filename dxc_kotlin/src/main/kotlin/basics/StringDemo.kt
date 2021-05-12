package basics

fun main() {
    var a = 9
    var b = "nithigna"
    var c = "Nithigna@$a"
    var sentence = "${b.replace("nithigna", "Nithigna")}"
    println(a)
    println(b)
    println(c)
    println(sentence)
    println("Max is " + maxOfNumbers(10, 90))

    val items = listOf<String>("nithigna", "vampire", "devil")

    for (item in items) {
        println(item)
    }
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}

fun maxOfNumbers(a: Int, b: Int): Int {
    return if (a > b) a
    else b
}
