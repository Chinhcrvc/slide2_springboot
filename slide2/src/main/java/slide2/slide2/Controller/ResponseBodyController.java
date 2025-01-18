package slide2.slide2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class ResponseBodyController {
    @ResponseBody
    @RequestMapping("/url5")
    public String mothod5() {
        return "Chào mọi người";
    }
    
    @ResponseBody
    @RequestMapping("/url6")
    public void metho6() {
    }
    
    @ResponseBody
    @RequestMapping("/url7")
    public Staff method7() {
        return new Staff("Nguyễn Văn Tèo", "20");
    }
    
}
