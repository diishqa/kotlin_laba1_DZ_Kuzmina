class DevelopmentDepartment : Department ("разработка") {
    override fun printDepartmentGoal() {
        println("цель отдела: $departmentName: Писать чистый кож")
    }

    override fun generateReport(): String {
        return "Отдел: $departmentName\nЦель: писать чистный код"
    }

}