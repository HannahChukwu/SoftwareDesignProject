package edu.trincoll.hr


// Abstract class Employee should have:
//   - a name of type String
//   - an id of type Int.
// It should implement the Comparable interface with the
// compareTo method.
//
// It should include an abstract method pay()
// that returns a Double.
//
// It should override the toString method to
// return a string with the name and id of the employee.
abstract class Employee(val name: String, val id: Int) : Comparable<Employee>{
    abstract fun pay(): Double

    override fun compareTo(other: Employee): Int {

        val payCompare = this.pay().compareTo(other.pay())
        if (payCompare != 0) return payCompare

        val nameCompare = this.name.compareTo(other.name)
        if (nameCompare != 0) return nameCompare

        return this.id.compareTo(other.id)

    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id"
    }

}
