package com.springcore.noXmlFile.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Car {
    @Value("BMW")
    private String brand;


    private Engine engine;

    public Car() {
        System.out.println("Car class default constructor executed");
    }

    public Car(Engine engine) {
        System.out.println("Car class ParamConstructor executed");
        this.engine = engine;
    }

    public void startCar(){
        System.out.println("Inside Car class");
        engine.startEngine();
        System.out.println(" and car has also started.. ");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                '}';
    }
}
