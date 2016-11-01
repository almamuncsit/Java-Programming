package configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by mamun on 9/28/16.
 */
public class Main {
    public Main() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
        helloWorld.setMessage("How are you ?");
        helloWorld.getMessage();
    }
}
