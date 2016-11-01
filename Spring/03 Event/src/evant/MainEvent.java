package evant;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEvent {
    public MainEvent() {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("evant/Bean.xml");
        context.start();
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        obj.getMessage();

        // Let us raise a stop event.
        context.stop();
    }
}
