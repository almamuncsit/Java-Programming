
package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("javaapplication24/beans.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.setMessage("how are you");
        System.out.println(hello.getMessage());
        
        ApplicationContext context2 = new AnnotationConfigApplicationContext(HelloConfig.class);
        Hello hello2 = (Hello) context2.getBean("hello");
        hello2.setMessage("Hello Spring");
        System.out.println(hello2.getMessage());
    }
}
