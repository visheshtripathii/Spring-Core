package com.springcore.lifecycle.annotationImpl;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("annconfig.xml");
        context.registerShutdownHook();
        Example example = (Example)context.getBean("sub1");
        System.out.println(example);
    }
}
