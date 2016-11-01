package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public Main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Annotation.xml");

        Student student = (Student) context.getBean("student");

        System.out.println("Name : " + student.getName() );
        System.out.println("Age : " + student.getAge() );
    }
}
