package com.springcore.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeamAnn {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public BeamAnn(String subject) {
        this.subject = subject;
    }
    public BeamAnn(){
        super();
    }

    @Override
    public String toString() {
        return "BeamAnn{" +
                "subject='" + subject + '\'' +
                '}';
    }

    @PostConstruct
    public void start(){
        System.out.println("ann start");
    }
    @PreDestroy
    public void end(){
        System.out.println("anne end");
    }

}
