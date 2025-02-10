package com.springcore.constructorinj;

public class Address {
    private String street1;
    private String street2;

    public Address(String street1, String street2) {
        this.street1 = street1;
        this.street2 = street2;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street1='" + street1 + '\'' +
                ", street2='" + street2 + '\'' +
                '}';
    }

}
