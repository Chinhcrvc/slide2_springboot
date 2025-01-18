package slide2.slide2.Controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondModel {
    @RequestMapping("/second/index")
    public String index(@ModelAttribute Date now, @ModelAttribute("q") String q) {
        return "model/indexx";
    }
}
