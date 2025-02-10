package com.springcore.autowiring.byName;

public class Employee {

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Setting address");
        this.address = address;
    }

    public Employee(Address address) {
        System.out.println("Constructor of Employee class");
        this.address = address;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
