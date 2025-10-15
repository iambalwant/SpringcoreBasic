package com.springcore.contructorInjection;


//Now with the help of contructor we set value without using getSetter
public class Person {
    private String name;
    private int personid;

public Person(String name,int personid){
    this.name = name;
    this.personid = personid;
}

    @Override
    public String toString() {
        return this.name+" : "+this.personid;
    }
}
