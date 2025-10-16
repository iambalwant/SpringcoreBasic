package com.springcore.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //through XML method
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("configLifeCycle.xml");
//        Bean bean = (Bean) context.getBean("lifecycle");
//        System.out.println(bean);
//        //pre-shutdown method - container call destroy method and destroy object after use
        context.registerShutdownHook();
//        //through interface method
//        BeamInterface beanInterface =(BeamInterface) context.getBean("interface");
//        System.out.println(beanInterface);
        //through annotations
        BeamAnn Bean =(BeamAnn) context.getBean("ann");
        System.out.println(Bean);
    }
}
