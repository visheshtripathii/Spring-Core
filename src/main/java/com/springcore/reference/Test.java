package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("referenceconfig.xml");
        Ram ram = (Ram)context.getBean("ramBean");
        ram.doMoreWork();


        // VALUES HAVE BEEN ADDED
        System.out.println(ram);
        Geeta geeta = (Geeta)context.getBean("geetaBean");
        System.out.println(geeta);
    }
}
