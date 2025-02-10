package com.springcore.lifecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleconfig.xml");
        context.registerShutdownHook();
        Customer cust1 = (Customer) context.getBean("cust1");
        System.out.println(cust1);
    }
}
