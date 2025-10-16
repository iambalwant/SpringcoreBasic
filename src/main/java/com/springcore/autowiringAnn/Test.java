package com.springcore.autowiringAnn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("configAutowiringAnn.xml");
        Employee emp = context.getBean("employee", Employee.class); // we don't need to type cast we this method
        System.out.println(emp);
    }
}
