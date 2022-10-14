// Inheritance in Kotlin

open class Pet(val name:String, val colour:String){
   open fun speak(){
        println("Grrrr")
    }
}

fun main(args:Array<String>){
    val p = Pet(name="Agnes", colour = "blue")
    println("My name is ${p.name} and I'm")

    val d = Dog(name="Agnes", colour = "blue")
    println("My name is ${p.name} and I'm")
}

//Dog class inheriting from the Pet class
class Dog(name: String, colour: String) : Pet(name, colour){
    override fun speak() {
        println("Woof woof!")
    }
}

//Fragile base class problem: Uncontrolled inheritance.
// To solve the fragile base class problem in Kotlin , you have to specify that you want to inherit it before you can
// inherit from them. So all the classes and methods in Kotlin are closed(final), unless you specify them as open before you
// inherit from them.

//Overriding: In order to override, you have to specify override keyword.


// In Java, if you don't want anyone to inherit from your class, you have to specify them as final.



