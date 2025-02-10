package com.springcore.noXmlFile.dependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(name="myEngine")
    public Engine getEngine(){
        return new Engine();
    }

    @Bean(name = {"carBean","carObject"})
    public Car getCar(){
        return new Car(getEngine());
    }
}
