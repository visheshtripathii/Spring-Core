package com.springcore.autowiring.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("byTypeconfig.xml");
        Student student = (Student) context.getBean("stu1");
        System.out.println(student);
    }
}
