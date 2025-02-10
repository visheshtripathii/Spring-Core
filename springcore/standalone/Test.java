package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standaloneconfig.xml");
        Person person = (Person)context.getBean("me");
        System.out.println(person);
        System.out.println("-------------------------------");
        System.out.println(person.getMyFriends());
        System.out.println(person.getMyFriends().getClass().getName());
        System.out.println("-----------------------------------------------");
        System.out.println(person.getFeeStructure());
        System.out.println(person.getFeeStructure().getClass().getName());
        System.out.println("-------------------------------------");
        System.out.println(person.getRandomSet());
        System.out.println(person.getRandomSet().getClass().getName());
        System.out.println("----------------------------------");
        System.out.println(person.getProps());
        System.out.println(person.getProps().getClass().getName());
    }
}
