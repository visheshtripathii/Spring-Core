package com.springcore.autowiring.annotationss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiredconfig.xml");
        Employee employee = (Employee)context.getBean("emp1");
        System.out.println(employee);

    }

}
