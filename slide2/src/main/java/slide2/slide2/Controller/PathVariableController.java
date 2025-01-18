package slide2.slide2.Controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class PathVariableController {

    @RequestMapping("/page/required/{size}/{number}")
    public String method(Model model,
    @PathVariable("size") int pageSize,
    @PathVariable("number") int pageNumber
    ) {
        model.addAttribute("size", pageSize);
        model.addAttribute("number", pageNumber);
        return "pathVariable/path";
    }

    @RequestMapping({"/page/optional", "/page/optional/{size}", "/page/optional/{size}/{number}"})
    public String option(Model model,
    @PathVariable("size") Optional<Integer> optPageSize,
    @PathVariable("number") Optional<Integer> optPageNumber
    ) {
        int pageSize = optPageSize.orElse(8);
        int pageNumber = optPageNumber.orElse(0);
        model.addAttribute("newsize", pageSize);
        model.addAttribute("newnumber", pageNumber);
        return "pathVariable/option";
    }
    
    
}
