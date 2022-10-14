// Enums
// The when keyword is like an enhanced switch case.
//If you use when, you must have an else branch, but when you use enums it's not a must to use the else branch.

enum class Colour(val r:Int, val g:Int, val b:Int){
    RED(255,0,0),
    ORANGE(255,165,0),
    YELLOW(255,255,0),
    GREEN(0,255,0),
    BLUE(0,0,255),
    INDIGO(75,0,130),
    VIOLET(238,130,238);

    //turns into decimal
    fun rgb(){ (r*256+g)*256 +b

    }
}

fun main(args:Array<String>){

    println(Colour.RED.rgb())
    println(Colour.INDIGO.rgb())

    //If you use when, you must have an else branch, but when you use enums it's not a must to use the else branch.
    val colour = Colour.BLUE
    val warmth = when(colour){
        Colour.RED, Colour.ORANGE, Colour.YELLOW -> "warm"
        Colour.GREEN -> "neutral"
        Colour.BLUE, Colour.INDIGO, Colour.VIOLET -> "cold"
    }
    println(warmth)




    //extension methods
    println("Maxwell".lastChar())
}





//1. Sealed classes
//From enum classes, we can create sealed classes.
//Sealed classes are open but if you inherit from them, the classes must be nested.
//But together with when, sealed class works like enums.
//Sealed classes are mostly used in primary library design.
//It helps to limit where they can be overriden.

//2. Nested and Inner Classes
//Works like a private nested class in java. You don't have access to the outer scope.
//Unless you declare them as inner.

//3. Extension methods.
//When you want to add methods to an existing class that is final.
//Useful when you are using a 3rd party library, and you want to extend the functionality a little.
// Or add a bit of functionality.
fun String.lastChar():Char = this.get(this.length - 1) //Extending the String method.

//4. Reflection
//It's when a program can access itself.
//Unit testing frameworks work on the principle of reflection.
