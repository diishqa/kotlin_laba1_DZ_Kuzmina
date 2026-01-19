class TestingDepatment : Department("Testirovanie"){
    override fun printDepartmentGoal() {
        println("cely otdela: $departmentName: Nahodity vse bagi")
    }
    override fun generateReport(): String {
        return "Otdel: $departmentName\nЦель: Nahodity vse bagi"
    }
}