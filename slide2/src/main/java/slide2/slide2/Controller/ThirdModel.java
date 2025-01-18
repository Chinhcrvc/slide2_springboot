package slide2.slide2.Controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ThirdModel {
    @ModelAttribute("now")
    public Date getNow(){
        return new Date();
    }

    @ModelAttribute
    public Staff getUser(){
        return new Staff("Nguyễn Văn Tèo", "20");
    }

    @RequestMapping("/third/index")
    public String index(Model model) {
        return "model/indexxx";
    }
    
}
