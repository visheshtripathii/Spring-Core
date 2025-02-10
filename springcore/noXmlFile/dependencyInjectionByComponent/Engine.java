package com.springcore.noXmlFile.dependencyInjectionByComponent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    @Value("Racing Engine")
    private String engineType;

    void startEngine(){
        System.out.println("Engine has started");
    }

    public Engine() {        // This will be used just to make object of Car class, not for DI.  IF YOU WANT TO REMOVE THIS THEN GO ON....
        System.out.println("Engine default cons");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineType='" + engineType + '\'' +
                '}';
    }
}
