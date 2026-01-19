class TestingDepatment : Department("Тестирование"){
    override fun printDepartmentGoal() {
        println("цель отдела: $departmentName: Находить все баги")
    }
    override fun generateReport(): String {
        return "Отдел: $departmentName\nЦель: Находить все баги"
    }
}