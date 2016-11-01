package InnerBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mamun on 9/28/16.
 */
public class InnerBeans {
    public InnerBeans() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        TextEditor te = (TextEditor) context.getBean("textEditor");

        te.spellCheck();

        te.getAddressList();
    }
}
