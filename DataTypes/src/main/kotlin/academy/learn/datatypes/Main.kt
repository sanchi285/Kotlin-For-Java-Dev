package academy.learn.datatypes

import academy.leanrPrograming.java.Dummy

fun main(args: Array<String>){
    val myInt = 10
    var myLong = 22L

    myLong = myInt.toLong()

    var myDouble = 65.984
    println(myDouble is Double)

    val char = 'b'
    val myChar: Char = 65.toChar()
    println(myChar)

    val myBoolean  =  true
    val  onVacation = Dummy().isVacationTime(myBoolean)
    println(onVacation)

    val anything : Any
}