package com.springcore.autowiring.annotationss;

public class Address {
    private String country;
    private String state;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        System.out.println("Setter country");
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        System.out.println("Setter state");
        this.state = state;
    }

    public Address(String country, String state) {
        System.out.println("Constructor Address");
        this.country = country;
        this.state = state;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
