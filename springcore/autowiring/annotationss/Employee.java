package com.springcore.autowiring.annotationss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    private int empId;

    @Autowired
    //@Autowired(required = false)      --> INSERT NULL IF THE BEAN IS NOT FOUND IN config.xml FILE.
    @Qualifier("address2")
    private Address address;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        System.out.println("Setter empId");
        this.empId = empId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Setter empAddress");
        this.address = address;
    }

    public Employee(Address address) {
        System.out.println("Constructor Employee");
        this.address = address;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", address=" + address +
                '}';
    }
}
