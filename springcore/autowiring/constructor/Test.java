package com.springcore.autowiring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("byconstructorconfig.xml");
        Player player = (Player)context.getBean("player1");
        System.out.println(player);
    }
}
