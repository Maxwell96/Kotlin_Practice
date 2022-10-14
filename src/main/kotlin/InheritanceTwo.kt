//Abstract class: Is by default open. If you want to open a class, but you don't want to inherit from them, you should
// use the abstract keyword.
//NB: You cannot instantiate an abstract class


abstract class Pett(val name:String, val colour:String){
    open fun speak(){
        println("Grrrr")
    }
}

fun main(args:Array<String>){
//    val p = Pett(name="Agnes", colour = "blue") //Pett class cannot be instantiated since it is an abstract class
//    println("My name is ${p.name} and I'm")
//
   val d = Dogg(name="Agnes", colour="blue", email = "Kofi")
   println("My name is ${d.name} and I'm ${d.colour}")

}

//Dog class inheriting from the Pet class
class Dogg(name: String, colour: String, override val email: String) : Pett(name, colour), EndUser{
    override fun speak() {
        println("Woof woof!")
    }
}



//Working with Interface
//Similar with java, you can inherit from only one class in Java, but you implement multiple interfaces
interface EndUser{
    //must be overridden
    val email: String
    //doesn't have a backing field, can be inherited
    val nickname: String
        get() = email.substringBefore('@')
}