package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student) context.getBean("stu1");
        System.out.println(student1);

        Student student2= (Student)context.getBean("stu2");
        System.out.println(student2);


        Student student3 = context.getBean("stu3", Student.class);
        System.out.println(student3);




    }
}