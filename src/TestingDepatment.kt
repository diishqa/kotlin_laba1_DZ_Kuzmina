class TestingDepatment : Department("Тестирование"){
    override fun printDepartmentGoal() {
        println("цель отдела: $departmentName: Находить все баги")
    }
}