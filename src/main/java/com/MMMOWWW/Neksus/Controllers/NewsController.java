package com.MMMOWWW.Neksus.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsController {
    @GetMapping("/news")  ///
    public String home(Model model) {

        return "news";  // Имя шаблона
    }
}
