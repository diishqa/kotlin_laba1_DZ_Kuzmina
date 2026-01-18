
fun main() {
    val employee=Employee("Kuzmina Diana Alexandrovna", "Programmer")

    employee.salary = 10
    employee.yearsOfExperience = 30

    println("fio - ${employee.getFullName()}")
    println("position - ${employee.getPosition()}")
    println("salary - ${employee.salary}")
    println("ezperience - ${employee.yearsOfExperience}")
}
enum class Priority {
    low,
    medium,
    high
}
data class Task(
    val title: String,
    val description: String,
    val priority: Priority,
    var isCompleted: Boolean=false
){

}