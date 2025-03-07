package com.springcore.dependencylookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.out.println("This is Bmw car");
//        Vehicle vehicle = new Vehicle();
//        vehicle.blowHorn();
//        vehicle.playMusic();
//        vehicle.fillFuel();
//        vehicle.travel();

        ApplicationContext context = new ClassPathXmlApplicationContext("lookupconfig.xml");
        Vehicle vehicle = (Vehicle) context.getBean("BMW$");
        vehicle.playMusic();
        vehicle.blowHorn();
        vehicle.fillFuel();
        vehicle.travel();
    }
}
