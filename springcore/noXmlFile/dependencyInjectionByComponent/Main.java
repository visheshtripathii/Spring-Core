package com.springcore.noXmlFile.dependencyInjectionByComponent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Car myCar = (Car)context.getBean("car");
        System.out.println(myCar);
        myCar.startCar();
    }
}
