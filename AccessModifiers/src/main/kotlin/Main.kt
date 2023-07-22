

fun main(args: Array<String>) {
    println("Hello World!")
    val emp = Employee("Rabiul Bhai Expert")
    println(emp.firstName)
    val emp2  = Employee("joe",false,90);

    println(emp2.firstName)
    println(emp2.fullTime)

    val dmc = Demo()
    println(dmc.dummy)
    emp2.fullTime=true

    emp2.salary=890;
    println(emp2.salary)
}

//primary constructor example
class Employee (val firstName: String, fullTime: Boolean = true, salary: Int=0) {
    var fullTime =  fullTime
        get(){
            println("custome test emp")
            return field
        }

        set(value){
            println("custome test set")
            field = value
        }
    var salary = salary
        get(){
            println("custome get sal")
            return field
        }

        set(value){
            println("custome  set sal")
            field = value
        }

}

//Secondary Constructor
class Demo{
    val dummy: String
    constructor(dummy: String){
        this.dummy = dummy
    }

    constructor(){
        this.dummy = "Hello"
    }
}