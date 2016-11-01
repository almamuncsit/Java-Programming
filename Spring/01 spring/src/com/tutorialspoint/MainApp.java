package com.tutorialspoint;

import com.tutorialspoint.Inheritance.HelloIndia;
import com.tutorialspoint.Inheritance.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

//        BeanScope beanScope = new BeanScope();

//        InitDestroy initDes = new InitDestroy();

/*
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        context.registerShutdownHook();
*/

        ApplicationContext context = new ClassPathXmlApplicationContext("Inheritance.xml");

        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

        objA.getMessage1();
        objA.getMessage2();

        HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();


    }
}