package com.springcore.autowiring.byType;

public class Address {
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        System.out.println("Setting city");
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
}
