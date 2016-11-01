package xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainXml {

    public MainXml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("XmlBeans.xml");

        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowException();
    }

}
