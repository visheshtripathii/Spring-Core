package com.springcore.stereotype.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionstereoconfig.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);
        System.out.println(employee.getAddress());
    }
}
