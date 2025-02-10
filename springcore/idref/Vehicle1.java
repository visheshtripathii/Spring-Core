package com.springcore.idref;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vehicle1 {

    String beanID;

    public Vehicle1(String beanID) {
        this.beanID=beanID;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("idrefconfig.xml");
        Engine1 bmwEngine = (Engine1)context.getBean(beanID);
        bmwEngine.start();
        bmwEngine.drift();
        bmwEngine.stop();

    }
}
