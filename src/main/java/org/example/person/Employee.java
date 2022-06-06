package org.example.person;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee extends Person{
    @Value("Natural sciences")
    private String department;
    @Value("80000")
    private int salary;
    @Value("1")
    private int grade;

    public Employee() {
    }

    public Employee(String department, int salary, int grade,@Autowired Person person) {
        this.department = department;
        this.salary = salary;
        this.grade = grade;
        this.setAge(person.getAge());
        this.setName(person.getName());
        this.setSurname(person.getSurname());
        this.setSex(person.getSex());
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEmployee{" +
                "department='" + department + '\'' +
                ", salary=" + salary +
                ", grade=" + grade +
                '}';
    }
}
