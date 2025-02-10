package com.springcore.noXmlFile.dependencyInjection;

import org.springframework.beans.factory.annotation.Value;

public class Engine {

    @Value("BMWEngine")
    private String engine;

    public void startEngine(){
        System.out.println("Engine has started.. ");
    }

    public Engine() {
        System.out.println("Engine default constructor executed");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engine='" + engine + '\'' +
                '}';
    }
}
