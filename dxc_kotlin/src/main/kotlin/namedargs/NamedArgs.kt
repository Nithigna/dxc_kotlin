package namedargs

data class Format(val userName : String, val domain : String){

}
fun main(){
    println(Format("nithna","nithigna.me"))
}