package org.example;

import org.example.config.MyConfig;
import org.example.person.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Employee employee = context.getBean("employee", Employee.class);
        context.close();
        System.out.println(employee.getDepartment());
        System.out.println(employee.getGrade());
    }
}
