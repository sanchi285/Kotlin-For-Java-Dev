import java.time.Year

fun main(args: Array<String>) {
    println("Hello World!")
    val emp = Employee("Rabiul Bhai Expert",fullTime = true)
    println(emp.firstName)
    val emp2  = Employee("joe",false,90);
    val emp3 = Employee("Rabiul Bhai Expert")
    println(emp2.firstName)
    println(emp2.fullTime)

    val dmc = Demo()
    println(dmc.dummy)
    emp2.fullTime=true

    emp2.salary=890;
    println(emp2.salary)

    println(emp3==emp)

    val car1 : Car = Car("Black","Lumber gini",2010)
    val car2 : Car = Car("Black","Lumber gini",2010)
    val car3 : Car = car1.copy(year = 2019)
    println(car1)
    println(car1==car2)
    println(car3)

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

    //over riding equals
    override fun equals(other: Any?): Boolean {
        val name  = other as Employee
        return firstName.equals(name.firstName)
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

data class Car(val color: String, val model: String, val year: Int){

}