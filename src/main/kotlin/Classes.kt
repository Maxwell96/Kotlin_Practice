// Class declaration with primary constructors
//Two approaches
//Getters and Setters are already embedded in it
class Person(val firstName: String, var age: Int) //2 instance attributes - one mutable, one immutable

fun main(args:Array<String>){
    //Look at the classes file before you come here
    val p = Person("Maxwell", 18)
    //firstName getter
    println("Hi, my name is ${p.firstName}") //Use $ sign for interpolation. Works like concatenation.
    //age setter
    p.age = 21 //age can be reassigned via a getter
    //age getter
    println("I am ${p.age} years old")

    val e = Employee(1, "IT")
    val e2 = Employee(1, "FIN", 18000.0)
    println("Employee 1 salary ${e.salary}")
    println("Employee 2 salaary ${e2.salary}")

    val receptionist = Employee("Becca", "0783264783")
    receptionist.name = "Smith"
    println(receptionist.name)
}

//Everything by default is public. You can import packages if you want.
//You can add access modifiers if you want. It will take you back to java.
//You don't have to write one class in one file. And you do not need to group them into packages.

class Employee(val emPID : Int, val dept : String, var salary: Double = 15000.0){
    //The need for overloading constructors is deprecated because we can have default values
    // (15000 is default value for salary)
    //initializer block intended to be used with the primary constructor
    init{
        salary = if (dept.equals("IT")) salary*1.20 else salary
    }

    //Creating custom setter
    var fName: String = ""
    var num: String = ""
    //Creating custom constructor
    constructor(name:String, phoneNum:String):this(0, "REC"){
        fName = name
        num = phoneNum
    }

    //custom setter
    var name: String = ""
        set(value){field = fName + value}

}

//An init block: Is the block which can be placed for the initialization codes the prefixed with the init
//keyword. During the initialization of an instance, the initializer blocks are to be executed in the same
//order, and they appear in the class body which is interleaved with the property initializers.

//NB:
//In java, arrays are covariant, but in kotlin arrays are invariant.


