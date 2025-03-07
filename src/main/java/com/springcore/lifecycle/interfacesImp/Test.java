package com.springcore.lifecycle.interfacesImp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("interfacelifecycleconfig.xml");
        context.registerShutdownHook();
        Employee employee = (Employee) context.getBean("emp1");
        System.out.println(employee);
    }
}
