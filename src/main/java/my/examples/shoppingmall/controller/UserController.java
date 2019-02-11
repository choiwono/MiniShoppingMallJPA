package my.examples.shoppingmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/users")
public class UserController {
    @GetMapping("/login")
    public String login(
            @RequestParam(name="fail",
            required=false,defaultValue="false") String errorFlag,
            Model model){
            model.addAttribute("errorFlag",errorFlag);
        return "users/login";
    }
}
