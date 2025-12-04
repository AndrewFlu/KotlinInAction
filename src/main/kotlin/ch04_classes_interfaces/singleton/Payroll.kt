package ch04_classes_interfaces.singleton

import ch04_classes_interfaces.backing_fields.Person

object Payroll {
    val allEmployees = mutableListOf<Person>()

    fun calculateSalary() {
        for (person in allEmployees) {
            // код обработки Person
        }
    }
}