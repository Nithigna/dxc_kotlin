package classesdemo

object DoAuth{
   private var username = "Nithigna"
   private var password = "rakesh"
    fun validateCredentials(username : String, password: String):Boolean{
        return this.username == username && this.password == password
    }
}

fun main() {
    if (DoAuth.validateCredentials("Nithigna","Nithigna")) println("Hey Nithigna") else print("Wrong Credentials")
}