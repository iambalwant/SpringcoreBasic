package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //here we are doing dependency injection
//        ApplicationContext in Spring
//        It is the central interface in the Spring Framework for dependency injection (DI) and managing beans.
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Students student1 = (Students) context.getBean("student1");
        Students student2 = (Students) context.getBean("student2");

        System.out.println(student1);
        System.out.println(student2);
    }
}
