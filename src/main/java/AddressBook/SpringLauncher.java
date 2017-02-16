package AddressBook; /**
 * Created by stephanernst on 1/26/2017.
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLauncher {
    public static void main(String[] args) {
        String[] contextPaths = new String[]{"application-context.xml"};
        new ClassPathXmlApplicationContext(contextPaths);
    }
}
