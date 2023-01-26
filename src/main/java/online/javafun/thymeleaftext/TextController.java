package online.javafun.thymeleaftext;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TextController {

    @GetMapping("/")
    String home(Model model) {
        model.addAttribute("firstName", "Jasiek");
        model.addAttribute("lastName", "Janowski");
        return "index";
    }
}
