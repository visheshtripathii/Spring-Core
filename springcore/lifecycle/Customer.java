package com.springcore.lifecycle;

public class Customer {
    private int customerId;
    private String customerName;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        System.out.println("Setting customerID..");
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        System.out.println("Setting customerName..");
        this.customerName = customerName;
    }

    public void init(){
        System.out.println("Initialization code : Connection with database created.. ");
    }

    public void destroy(){
        System.out.println("Clean-up code : Connection with database closed.. ");
    }


    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
