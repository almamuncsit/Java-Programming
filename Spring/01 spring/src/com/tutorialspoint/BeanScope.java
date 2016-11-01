package com.tutorialspoint;

import com.tutorialspoint.Beans.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanScope {
    public BeanScope() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

        objA.setMessage("I'm object A");
        objA.getMessage();

        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        objB.getMessage();


        ApplicationContext cont = new ClassPathXmlApplicationContext("singleton-beans.xml");
        HelloWorld sobjA = (HelloWorld) cont.getBean("helloWorld");

        sobjA.setMessage("I'm object A");
        sobjA.getMessage();

        HelloWorld sobjB = (HelloWorld) cont.getBean("helloWorld");
        sobjB.getMessage();
    }
}
