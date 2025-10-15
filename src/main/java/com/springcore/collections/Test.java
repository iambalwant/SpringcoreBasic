package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configCollections.xml");
        Emp employee = (Emp) context.getBean("beanCollection");
        System.out.println(employee.getName());
        System.out.println(employee.getAddress());
        System.out.println(employee.getCourses());
        System.out.println(employee.getPhones());
    }
}
