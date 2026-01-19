class Employee(
    private var fullName: String,
    private var position: String

) {
    var salary: Int=0
        set(value){
            if (value<0){
                println("ошибка")
            } else{
                field=value
            }
        }
    var yearsOfExperience: Int=0
        set(value) {
            if (value>50){
                println("слишком много")
            } else{
                field=value
            }

        }
    fun getFullName()=fullName
    fun getPosition()=position

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

abstract class Department(){

}