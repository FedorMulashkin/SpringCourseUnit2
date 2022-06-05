package org.example.person;

import org.jetbrains.annotations.NotNull;

public class Employee extends Person{
    private String department;
    private int salary;
    private int grade;

    public Employee() {
    }

    public Employee(String department, int salary, int grade, @NotNull Person person) {
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
