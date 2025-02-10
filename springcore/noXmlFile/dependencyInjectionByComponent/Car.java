package com.springcore.noXmlFile.dependencyInjectionByComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Value("Mercedes")
    private String brand;

    @Autowired
    private Engine engine;

    public void startCar(){
        System.out.println("Inside Car class");
        engine.startEngine();
    }

    public Car() {       // This will be used just to make object of Car class, not for DI.  IF YOU WANT TO REMOVE THIS THEN GO ON....
        System.out.println("Car default Cons");
    }

//    public Car(Engine engine) {                              // No need for this because IOC container does not use Constructor Injection when doing DI by @Autowired.
//        System.out.println("Car param cons");
//        this.engine = engine;
//    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                '}';
    }
}
