package com.tutorialspoint;


import com.tutorialspoint.Beans.HelloWorld;
import com.tutorialspoint.Beans.InintDestroyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDestroy {
    public InitDestroy() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        InintDestroyBean inintDestroyBean = (InintDestroyBean) context.getBean("inintDestroyBean");

        inintDestroyBean.getMessage();
        System.out.println("Roll is : " + inintDestroyBean.getRoll());
    }
}
