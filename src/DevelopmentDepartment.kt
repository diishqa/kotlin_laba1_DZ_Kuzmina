class DevelopmentDepartment : Department ("Razrabotka") {
    override fun printDepartmentGoal() {
        println("cely otdela: $departmentName: Picaty chistiy kod")
    }

    override fun generateReport(): String {
        return "Otdel: $departmentName\nCelyi: Picaty chistiy kod"
    }

}