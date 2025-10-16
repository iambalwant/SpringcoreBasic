package com.springcore.autowiringAnn;


import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

//    we have to inject address class into employee class - employee is dependent on address class
    @Autowired //only this annotation need to autowire - uses type to autowire
    private Address address;

    public Address getAddress() {
        return address;
    }

//    @Autowired - on setter also
    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee(){
        super();
    }
//    @Autowired - on parameter constructor
    public Employee(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
