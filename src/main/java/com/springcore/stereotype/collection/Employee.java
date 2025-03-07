package com.springcore.stereotype.collection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Employee {
    @Value("102")
    private int id;
    @Value("Cristiano Ronaldo")
    private String name;
    @Value("#{temp}")
    private List<String> address;

    //Values inside field will be injected through field injection.

    public List<String> getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
