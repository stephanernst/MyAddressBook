package AddressBook;

import AddressBook.BuddyInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
/**
 * Created by stephanernst on 2/16/2017.
 */
@Controller
public class AddressBookController {

    /*@RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }*/

    @GetMapping("/addressBooks")
    public String addressBookForm(Model model) {
        model.addAttribute("addressBooks", new AddressBook());
        model.addAttribute("buddy", new BuddyInfo());
        return "addressBooks";
    }

    @PostMapping("/greeting")
    public String addBuddySubmit(@ModelAttribute BuddyInfo greeting) {
        return "result";
    }
}