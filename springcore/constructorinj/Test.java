package com.springcore.constructorinj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorinjconfig.xml");
        Student student = (Student)context.getBean("stud1");
        System.out.println(student);
        Addition addition = (Addition)context.getBean("addition1");
        int result = addition.doSum();
        System.out.println(result);
    }
}
