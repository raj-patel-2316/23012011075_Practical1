open class Person(val firstName: String, val lastName: String, val age: Int) {
   constructor(firstName: String, lastName: String) : this(firstName, lastName, 18)
}


class Student(firstName: String, lastName: String, age: Int,
             val enrollmentNo: String, val branch: String, val className: String, val labBatch: String)
   : Person(firstName, lastName, age) {


   constructor(firstName: String, lastName: String, enrollmentNo: String, branch: String, className: String, labBatch: String)
           : this(firstName, lastName, 18, enrollmentNo, branch, className, labBatch)


   fun showInfo() {
       println("Name: $firstName $lastName, Age: $age, Enrollment: $enrollmentNo, Branch: $branch, Class: $className, Lab Batch: $labBatch")
   }
}


fun main() {
   val students = arrayListOf(
       Student("Rahul", "Sharma", 20, "EN001", "CSE", "TYCSE", "B1"),
       Student("Priya", "Mehta", 19, "EN002", "IT", "SYIT", "B2"),
       Student("Amit", "Patel", 21, "EN003", "ECE", "TYECE", "B1"),
       Student("Sneha", "Desai", 20, "EN004", "CSE", "TYCSE", "B3"),
       Student("Vikas", "Joshi", 22, "EN005", "ME", "TYME", "B2")
   )


   for (s in students) {
       s.showInfo()
   }
}
