package com.springcore.idref;

import com.springcore.dependencylookup.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.out.println("This is Bmw car");

        ApplicationContext context = new ClassPathXmlApplicationContext("idrefconfig.xml");
        Vehicle1 vehicle = (Vehicle1) context.getBean("BMW");
        vehicle.playMusic();
        vehicle.blowHorn();
        vehicle.fillFuel();
        vehicle.travel();
    }
}
