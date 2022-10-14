data class Client(val name:String, val postCode: String) {

}

fun main(args:Array<String>){
    val c1 = Client("Maxwell", "BN1 PMA")
    val c2 = Client("Maxwell", "BN1 PMA")

    //.equals
    println(c1==c2)
    println(c1) //Without specifying data class, toString method doesn't override automatically
    println(c2) //thus prints the variable name and location in memory

    val c3 = Client("Maxwell", "BN1 PMA")
    val c4 = Client("Maxwell", "BN1 PMA")
    
    //.copy method available for only data class
    val c6 = c1.copy();

    //.equals
    println(c3==c4)
    println(c3)
    println(c4)


    //destructing data classes. Only for data classes
    val (name, postCode) = c1
    println(name)
    println(postCode)

    val clients = listOf<Client>(c1, c2)
    for (c in clients){
        println(c)
    }

    val clientsMap = mapOf<String, Client>("IT" to c1, "REC" to c2)
    for ((key, value) in clientsMap){
        println("$key -> $value")
    }


}

//With one keyword "data class", Kotlin will override, toString(), equals() and hashCode().
//data class

