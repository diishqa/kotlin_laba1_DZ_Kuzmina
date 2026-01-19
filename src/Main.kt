
fun main() {

    val employee=Employee("Kuzmina Diana Alexandrovna", "Programmer")

    employee.salary = 10
    employee.yearsOfExperience = 30

//    println("fio - ${employee.getFullName()}")
//    println("position - ${employee.getPosition()}")
//    println("salary - ${employee.salary}")
//    println("ezperience - ${employee.yearsOfExperience}")

    val task1=Task("fix", "ispravit", Priority.high)
    val task2=Task("fix", "ispravit", Priority.high)
    val task3=Task("fix", "ispravit", Priority.medium)
    println("sravnenie equals: ${task1.equals(task2)}")
    println("sravnenie equals: ${task1.equals(task3)}")

    println("hashCode task1: ${task1.hashCode()}")
    println("hashCode task2: ${task2.hashCode()}")
    println("hashCode task3: ${task3.hashCode()}")

    println(task1.toString())

    val tCopy=task1.copy()
    println(tCopy)

    val dep=DevelopmentDepartment()
    val test=TestingDepatment()
    dep.printDepartmentGoal()
    test.printDepartmentGoal()

    val reps: List<ReportGenerator> = listOf(employee, dep, test)
    for (rep in reps){
        println(rep.generateReport())
    }

    employee.assingTask(task1)
    employee.assingTask(task2)
    employee.assingTask(task3)
    println("svodniy otchet:")
    println(employee.generateReport())
    dep.printDepartmentGoal()


}


