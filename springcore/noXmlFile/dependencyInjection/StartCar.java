package com.springcore.noXmlFile.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class StartCar {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Car bmwCar = (Car) context.getBean("carObject");
        System.out.println(bmwCar);

        bmwCar.startCar();
    }
}
