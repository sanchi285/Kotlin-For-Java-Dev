package academy.learnprogramming.challenge1

fun main(args: Array<String>) {
    //declear two immutable string
    val hello1 :String = "Hello"
    val hello2 :String = "Hello"

    //Using One line of Code Hello1 and Hello2 are refferencially equal

    println(hello1===hello2)
    println(hello1==hello2)

    var imu : Int  = 2988

    println(imu)

    val any : Any = "Joy Bangla"
    if(any is String){
        println(any.toUpperCase())
    }
    
    println(""" |1
        |11
                |111
    """.trimMargin())
}