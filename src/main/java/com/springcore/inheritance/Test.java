package com.springcore.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("inheritanceconfig.xml");
        Child child = context.getBean("beta",Child.class);
        System.out.println(child);

        System.out.println(child.getCommonData()); // accessing parent method by child object
    }


}
