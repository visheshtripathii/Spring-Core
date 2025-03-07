package com.springcore.autowiring.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("byNameconfig.xml");
        Employee empl = (Employee) context.getBean("employee1");
        System.out.println(empl);
    }
}
