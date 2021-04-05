package cors.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CorsController {

    @GetMapping("/view")
    public String view() {
        return "/cors";
    }
}
