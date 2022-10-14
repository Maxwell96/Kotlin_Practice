var funds : Double = 100.0
val pswd = "password"

fun main() {
    var input : String
    var cmd : List<String>

    while (true) {
        print("Command: ")
        input = readLine()!!
        cmd = input.split(" ")
        when (cmd[0]) {
            "balance" -> balance()
            //"deposit" -> deposit()
            // Each command goes here...
            else -> println("Invalid command")
        }
    }
}

fun balance(){
    println(funds)
}

fun deposit(money:Double){
    println("Enter the amount to deposit: ")
    var amount = readLine()?.split(" ")
}
