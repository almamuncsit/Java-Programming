
package com.aop.test;

import com.aop.services.EmpService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/test/spring-config.xml");
        EmpService eservice = context.getBean("empservices", EmpService.class);
        System.out.println(eservice.getManager().getName());
    }
}
