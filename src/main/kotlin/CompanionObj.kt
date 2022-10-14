//There is no static keyword in Kotlin. If you want to create a static method, there are two ways to do it.
//1. Just create a function and its already static
//2. Creating Companion Objects - it is also useful for the Factory Method(Factory Design Pattern)
//Companion Objects also help us to create Singleton easily.
//Companion Objects have access to the private properties of a class.



fun main(args: Array<String>){
    //1.
//    val user1 = User("martina@email.com")
//    println("User1 ${user1.nickname}")
//
//    val user2 = User(12345)
//    println("User2 ${user2.nickname}")

    //2. using companion objects
    val user1 = User.newSubscribingUser("martina@gmail.com")
    println("User1 ${user1.nickname}")
    val user2 = User.newFacebookUser(12345)
    println("User2 ${user2.nickname}")
}


class User private constructor(val nickname: String) {
    //used as factory
    companion object {
        fun newSubscribingUser(email: String) =
            User(email.substringBefore('@'))
        fun newFacebookUser(accountId: Int) =
            User("FB$accountId")
    }
}
