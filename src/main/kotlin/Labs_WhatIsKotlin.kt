fun main() {
    println("Hello, World!")

    //Question 1
    var a : String = "Hello!"
    println(a)

    //Question 3
    for (i in -5..5){
        println(calculateY(3, i, -1))
    }

    //Question 4
    var y1: Int
    var y2: Int
    for (j in 0..20){
        y1 = calculateY(3, j, 5)
        y2 = calculateY(4, j, 2)

        if(y1 == y2){
            println("y1 meets y2 where (x, y) -> ($j, $y1)")
            println(j.toString()+","+y1.toString()) //This also works.
        }

    }

    intersection(3, 5, 4, 2 )
    intersection(2, 1, 3, 3 )
    intersection(-2, 3, 3, -2 )

}

//Question 2
fun calculateY(m : Int, x : Int, c : Int) : Int {
    // y = mx + c - formula for a straight line
    return m * x + c
}

fun intersection(mOne : Int, cOne : Int, mTwo : Int, cTwo : Int) : Unit {
    // This function takes the equations of two lines:
    // yOne = mOne * x + cOne and yTwo = mTwo * x + cTwo
    // and prints the X value they intersect at
    // or prints "Don't intersect" if they do not.
    // You only need to check x values between 0 and 100

    var count: Int = 0
        for(x in 0..100) {
            var y1 = mOne * x + cOne
            var y2 = mTwo * x + cTwo

            if(y1==y2){
                println(x)
                break
            }
            else{
                if(x==100){
                    println("Don't Intercept")
                }
            }
        }
}