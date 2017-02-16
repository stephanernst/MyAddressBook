package AddressBook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * Created by stephanernst on 2/16/2017.
 */
@Controller
public class HomeController {

    /*@RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }*/

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new BuddyInfo());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute BuddyInfo greeting) {
        return "result";
    }
}