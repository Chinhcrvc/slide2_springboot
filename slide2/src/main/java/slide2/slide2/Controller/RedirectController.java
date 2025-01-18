package slide2.slide2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;




@Controller
public class RedirectController {
    @RequestMapping("/url3")
    public String mothod1(Model model, @RequestParam(name="message") String message) {
        model.addAttribute("message", message);
        return "view/redirect";
    }
    
    @RequestMapping("/url4")
    public String method2(RedirectAttributes params) {
        params.addAttribute("message", "RedirectAttributes");
        return "redirect:/url3";
    }
    
}
