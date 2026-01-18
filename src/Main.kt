
fun main() {
    val employee=Employee("Kuzmina Diana Alexandrovna", "Programmer")

    employee.salary = 10
    employee.yearsOfExperience = 30

    println("fio - ${employee.getFullName()}")
    println("position - ${employee.getPosition()}")
    println("salary - ${employee.salary}")
    println("ezperience - ${employee.yearsOfExperience}")
}