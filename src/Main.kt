
fun main() {
    val employee=Employee("Kuzmina Diana Alexandrovna", "Programmer")

    employee.salary = 10
    employee.yearsOfExperience = 30

//    println("fio - ${employee.getFullName()}")
//    println("position - ${employee.getPosition()}")
//    println("salary - ${employee.salary}")
//    println("ezperience - ${employee.yearsOfExperience}")

    val task1=Task("fix", "исправить", Priority.high)
    val task2=Task("fix", "исправить", Priority.high)
    val task3=Task("fix", "исправить", Priority.medium)
    println("сравнение equals: ${task1.equals(task2)}")
    println("сравнение equals: ${task1.equals(task3)}")

    println("hashCode task1: ${task1.hashCode()}")
    println("hashCode task2: ${task2.hashCode()}")
    println("hashCode task3: ${task3.hashCode()}")

    println(task1.toString())

    val tCopy=task1.copy()
    println(tCopy)

    val dev=DevelopmentDepartment()
    val test=TestingDepatment()
    dev.printDepartmentGoal()
    test.printDepartmentGoal()

    val reps: List<ReportGenerator> = listOf(employee, dev, test)
    for (rep in reps){
        println(rep.generateReport())
    }

}


