package AddressBook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * Created by stephanernst on 2/16/2017.
 */
@Controller
public class MyController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }
}
