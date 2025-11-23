package org.example.app.lesson_2

fun main() {
    val numberOfEmployees: Byte = 50
    val numberOfIntern: Byte = 30
    val salaryEmployees: Short = 30_000
    val salaryIntern: Short = 20_000
    val sumSalaryEmployees: Int = numberOfEmployees * salaryEmployees
    println(sumSalaryEmployees)
    val sumSalaryEmployeesAndSalaryIntern: Int = sumSalaryEmployees + (numberOfIntern * salaryIntern)
    println(sumSalaryEmployeesAndSalaryIntern)
    val averageSalary: Int = sumSalaryEmployeesAndSalaryIntern / (numberOfEmployees + numberOfIntern)
    println(averageSalary)
}