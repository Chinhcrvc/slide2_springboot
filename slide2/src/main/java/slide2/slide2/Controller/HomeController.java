package slide2.slide2.Controller;

import java.io.File;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
@RequestMapping("login")
public class HomeController {
    
    @Autowired
    HttpServletRequest request;
    @Autowired
    HttpServletResponse response;
    @Autowired
    ServletContext context;

    @RequestMapping("")
    public String index(Model model, 
        HttpServletRequest request, 
        HttpServletResponse response) {  
        model.addAttribute("title1", "Hihi");
        String q = request.getParameter("q");
        if(q == null || q.isEmpty()){
            q = "Hello Spring boot";
        }
        model.addAttribute("title2", q);
        Cookie cookie = new Cookie("aBC", "XYZ");
        response.addCookie(cookie);
        response.setHeader("abc", "abc");
        return "home/index";
    }
    
    @GetMapping("/form")
    public String form(
        Model model, 
        @RequestParam("page") Optional<Integer> page){
        int pg = page.orElse(0);
        model.addAttribute("message", pg);
        return "login/login";
    }

    @PostMapping("/check")
    public String login(
        Model model, 
        @RequestParam("uname") String uname, 
        @RequestParam("pass") String pass,
        @RequestPart("photo") MultipartFile photoFile
        ) {

        // String uname = request.getParameter("uname");
        // String pass = request.getParameter("pass");
        String message;
        if(uname == null || pass == null || uname.isEmpty() || pass.isEmpty()){
            message = "Vui lòng điền đầy đủ thông tin!";
        }else if(uname.equals("poly") && pass.equals("123")){
           message = "Login thành công!";
        }else{
            message = "Login thất bại!";
        }

        // @RequestPart
        if(!photoFile.isEmpty()){
            String dir = "/E:/javaspringboot/slide2/photos/";
            String fileName = photoFile.getOriginalFilename();
            try {
                photoFile.transferTo(new File(dir, fileName));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        model.addAttribute("message", message);        
        return "login/login";
    }    
    
}
