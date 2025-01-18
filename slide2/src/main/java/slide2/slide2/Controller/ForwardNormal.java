package slide2.slide2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class ForwardNormal {
    @RequestMapping("/home/index")
    public String index(Model model) {
        return "home/homepage";
    }
    
    // Hàm void thì tên view sẽ là mapping-url 
    @RequestMapping("/home/homepage")
    public void index() {
    }
   
}
