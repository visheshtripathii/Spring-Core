package com.springcore.autowiring.byName;

public class Address {
    private String nation;
    private String city;

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        System.out.println("Setting nation");
        this.nation = nation;
    }

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
                "nation='" + nation + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
