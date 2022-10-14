//Printing "Hello world!"
//No class required, can have as header.
fun main(args: Array<String>):Unit{ //The Unit keyword similar to specify void return type function
    // No main method required
    println("Hello world!") //NB: No semicolon

    //Let us consider an example
    val a:Int = 9
    //typed inference
    var b = 10
    if (a>b){
        println(a)
    }
    else{
        println(b)
    }

    //You can write this whole if as this and assign to a value. Similar to ternary operations
    //Because in Kotlin, if is an expression. It returns a value. It returns the last expression in the if
    val max = if (a>b) a else b // max will be of type any
    val sum = if(a>b){ // Sum will be of type Any since. Because it may either hold an Int or a String
        //depending on the last line that runs in the if expression
        println(a)
        a+b
    } else{
        println(b)
    }

    val m: Any //Val is like a constant then we cannot reassign it
    m = 10
//    m = 2 //Cannot not reassign a val

    var n: Any //var is a variable and can be reassigned
    n= 10
    n = 5 //You can reassign n since it is a variable

    var d: Any //var of type Any can be reassigned to
    d= 10
    d = "Maxwell" //You can reassign n to a string since it is of type Any

    //To prevent NullPointerException. Thus accept null values. Thus Nullable
    var myString : String? = "Maxwell"
    myString = null

    var myString2 : String = "Maxwell"

    demo(myString2)
    var result = findMax(3,6)
    println(result)

//    for (i in 1..100){
//       println(fizzBuzz(i))
//    }

//    for(i in 100 downTo 1 step 2){
//        println(fizzBuzz(i))
//    }

    println("Hello, my name is $myString")

    ranges()


} //Still curly braces

// There is an Any type in Kotlin. Similar to the Object class in Java.
// The Any class is the parent of all types in Kotlin. And all classes/types inherit from it.
// There are 3 methods inherited from the Any class. toString(), equals() and hashCode() similar to java.
// Any is a singleton object

fun another(args: Array<String>):Unit{
    //Working with loops
    for (ar in args){ //Enhanced for loop similar to Python
        println(ar)
    }

    for (i in 1..100){ //Counting loops, similar to Python
        println(i)
    }

    //You can specify the step size in a
    for(i in 100 downTo 1 step 2){
        println(i)
    }

    for (i in 1..100){
        println(fizzBuzz(i))
    }

}

fun demo(name:String){
    println(name)
}

fun demoAgain(name:String?){
    println(name)
}

//expression body
fun findMax(a:Int, b:Int):Int = if (a>b) a else b //This is also a function, but it looks unfamiliar
var result = findMax(2, 5) //Running the functions

//Kotlin switch cases uses a keyword when (when expression)
//fizzBuzz example
//    for (i in 1..100){
//        print(fizzBuzz(i))
//    }
//    for(i in 100 downTo 1 step 2){
//        print(fizzBuzz(i))
//    }
//    for (c in 'A'..'F'){
//      print(c)
//    }

fun fizzBuzz(i:Int) = when{
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}


fun ranges(){
    //Check if an element is in the range
    var c:Char = readlnOrNull()!!.toCharArray()[0]
    val msg = when(c){
        in 'A'..'Z' -> "It's a letter!"
        in '0'..'9' -> "It's a number!"
        else -> "Dunno"
    }
    print(msg)

}

//NB: In Kotlin all types starts with a Capital because they are bundled into an Object
// During compilation they leverage the primitive types
//NB: We can mix Kotlin and Java when writing code.

// All modern programming languages uses Runtime Exceptions only and not Checked Exceptions.

//Try and Catch are also expressions because they return a value. Either of the expressions are returned.
