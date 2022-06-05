package org.example;

import org.example.person.Employee;
import org.example.person.Person;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Fedor", "Mulashkin", "MALE", 24);
        Employee employee = new Employee("Natural sciences", 80000, 1, person);
        System.out.println(employee.toString());
    }
}
