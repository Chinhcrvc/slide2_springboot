package slide2.slide2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;


@Controller
@RequestMapping("cookie")
public class CookieController {

    @RequestMapping("/read")
    public String readCookie(Model model, 
    @CookieValue(name="cki", defaultValue="poly") String val){
        model.addAttribute("cookieValue", val);
        return "cookie/read";
    }
    
    @RequestMapping("/create")
    public String createCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("cki", "fpt");
        cookie.setMaxAge(10);
        cookie.setPath("/");
        response.addCookie(cookie);
        return "redirect:/cookie/read";
    }
    
}
