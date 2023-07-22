

fun main(args: Array<String>) {
    println("Hello World!")
    val emp = Employee("Rabiul Bhai Expert")
    println(emp.firstName)
    val emp2  = Employee("joe",false);

    println(emp2.firstName)
    println(emp2.fulltime)
}

class Employee (val firstName: String) {
    var fulltime: Boolean = true
    constructor(firstName: String, fulltime: Boolean) :this (firstName){
        this.fulltime = fulltime
    }
}