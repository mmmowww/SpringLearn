package Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    /// Похоже с роутингом как
    /// D laravel
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "General");
        return "home";  // Имя шаблона
    }
}

