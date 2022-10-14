abstract class Pettt(val name:String, val colour: String){
    abstract fun speak()
}

fun main(args:Array<String>){
//    val p = Pet(name="Agnes", colour="blue")
//    println("My name is ${p.name} and I'm ${p.colour}")

    val d = Doggg("Buddy", "brown-ish", "Buddy@woofwoof.com")
    println("My name is ${d.name} and I'm ${d.colour}")
    println("My email is ${d.email}")
    println("My nickname is ${d.nickname}")
    d.sayHello()
}

class Doggg(name: String, colour:String, override val email: String) : Pet(name, colour),Patient, Affable{
    override fun speak(){
        println("Woof woof!")
    }

    override fun sayHello(){
        super<Patient>.sayHello()
        super<Affable>.sayHello()
    }
}

//registered at a vet office
interface Patient{
    //must be overridden
    val email: String
    //doesn't have a backing field, can be inheritted
    val nickname: String
        get() = email.substringBefore('@')
    fun sayHello(){
        println ("Hi")
    }
}

interface Affable{
    fun sayHello(){
        println ("Hiya everyone!")
    }
}