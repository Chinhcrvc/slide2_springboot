package slide2.slide2.Controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class FirstModel {
    @RequestMapping("/first/index")
    public String index(Model model) {
        model.addAttribute("message", "Hello Spring");
        model.addAttribute("Hello Spring");
        model.addAttribute("now", new Date());
        model.addAttribute(new Date());
        return "model/index";
    }  
}
