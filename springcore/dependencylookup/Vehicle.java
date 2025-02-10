package com.springcore.dependencylookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vehicle {

    public Vehicle() {
    }
     public void playMusic(){
         System.out.println("Music is playing");
     }
     public void blowHorn(){
         System.out.println("Horn blown");
     }
     public void fillFuel(){
         System.out.println("Fuel filled");
     }
     public void travel(){
         ApplicationContext context = new ClassPathXmlApplicationContext("lookupconfig.xml");
         Engine bmwEngine = (Engine)context.getBean("bmwEngine");
         bmwEngine.start();
         bmwEngine.drift();
         bmwEngine.stop();

     }
}
