package slide2.slide2.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BeanController {
    @RequestMapping("/")
    public String save(Model model, Staff bean) {
        model.addAttribute("name", bean.fullname);
        model.addAttribute("tuoi", bean.age);
        return "view/path";
    }
}
