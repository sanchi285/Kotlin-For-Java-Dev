fun main(args: Array<String>) {
    val number: Int
    number = 10

    val employee1 = Employee("Mary", 1)
    val  employee2 = Employee("John", 2)
    val  employee3 = Employee("John", 2)

    val employee4 = employee2

    println(employee1==employee2)
    println(employee2===employee3)
    println(employee3.equals(employee2))
    println(employee2.equals(employee1))
    println(employee2==employee4)
    employee4.name="Karim"
    println(employee2.name)
}

class Employee(var name: String, val id: Int){
    override fun equals(obj: Any?): Boolean {
       if (obj is Employee){
           return name==obj.name && id == obj.id;
       }
        return false;
    }
}
