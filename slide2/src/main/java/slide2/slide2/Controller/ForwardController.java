package slide2.slide2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class ForwardController {
    @RequestMapping("/url1")
    public String method1(Model model) {
        return "view/forward";
    }
    
    @RequestMapping("/url2")
    public String method3(Model model) {
        model.addAttribute("message", "Spring boot");
        return "forward:/url1";
    }
    
}
