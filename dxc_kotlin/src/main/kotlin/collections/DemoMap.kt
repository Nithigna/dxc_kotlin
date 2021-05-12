package collections

fun main() {
    val passedStudents : MutableMap<Int, String> = mutableMapOf()
    passedStudents.put(1,"nithigna")
    passedStudents.put(2,"n")
    passedStudents.put(3,"royal")
    for ((i,j) in passedStudents){
        println(j)
    }

   println( passedStudents.values.filter { x -> x.startsWith("n") } )

    println( passedStudents.values.filter { it.startsWith("n") } )
}