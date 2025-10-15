package com.springcore.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeamInterface implements InitializingBean, DisposableBean {
   private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BeamInterface(){
        super();
    }

    @Override
    public String toString() {
        return "BeamInterface{" +
                "price=" + price +
                '}';
    }

    //init code
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Taking init code interface");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy interface method");
    }
}
