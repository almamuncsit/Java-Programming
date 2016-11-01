package CustomEvent;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mamun on 9/28/16.
 */
public class MainCustomEvent {
    public MainCustomEvent() {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("CustomEvent/Beans.xml");

        CustomEventPublisher cvp =
                (CustomEventPublisher) context.getBean("customEventPublisher");
        cvp.publish();
        cvp.publish();
    }
}
