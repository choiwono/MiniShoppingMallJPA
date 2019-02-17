package my.examples.shoppingmall.controller.api;

import my.examples.shoppingmall.dto.CartItem;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/order/api")
public class OrderApiController {
    @PostMapping
    public String addCart(@RequestBody CartItem cartItem,
                          Principal principal,
                          HttpSession session){
        return "ok";
    }
}
