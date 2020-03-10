package com.MMMOWWW.Neksus.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
///////
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    //@GetMapping("/")     //одна из них
    @RequestMapping("/")  ///
    public String home(Model model) {

        return "home";  // Имя шаблона
    }
}

