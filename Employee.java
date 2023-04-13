package org.example;
import java.util.Objects;
public class Employee {

    static int personCounter =0;
    int age;
    String firstName;
    String lastName;
    double salary;
    int id;

    public Employee(int age, String firstName, String lastName, int id) {
        this(age, firstName, lastName,50,id);
    }

    public Employee(int age, String firstName, String lastName,double salary, int id) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        personCounter++;
    }
    @Override
    public String toString() {
        return String.format("A:%d FN:%s Ln:%s salary:%f id:%d ", age, firstName, lastName, salary, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee employee) {
            return firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

}



