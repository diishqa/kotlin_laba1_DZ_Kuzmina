class Employee(
    private var fullName: String,
    private var position: String

) : ReportGenerator {
    var salary: Int=0
        set(value){
            if (value<0){
                println("oshibka")
            } else{
                field=value
            }
        }
    var yearsOfExperience: Int=0
        set(value) {
            if (value>50){
                println("slishkom  mnogo")
            } else{
                field=value
            }

        }
    fun getFullName()=fullName
    fun getPosition()=position

    var currentTask: Task? = null
    fun assingTask(newTask: Task){
        if (currentTask?.isCompleted==false){
            println("sotrudnic yzge zanyat: ${currentTask?.title}")
        }
        else{
            currentTask=newTask
            println("zadacha: ${newTask.title} dlya sotrudnica - $fullName")
        }
    }

    override fun generateReport(): String {
        return "FIO: $fullName\nDolzgnosty: $position\nZarplata: $salary\nOpit: $yearsOfExperience"
    }

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
){}

abstract class Department(
    val departmentName: String
) : ReportGenerator {
    abstract fun printDepartmentGoal()

}
