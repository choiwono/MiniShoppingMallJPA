package my.examples.shoppingmall.controller.api;

import my.examples.shoppingmall.dto.CartItem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/cart")
public class CartApiController {

    @PostMapping
    public String addCart(@RequestBody CartItem cartItem,
                          Principal principal,
                          HttpSession session){
        int result = 0;
        if(principal == null){
            if(session.getAttribute("cart") == null) {
                Map<Long, Integer> cart = new HashMap<>();
                cart.put(cartItem.getProductId(), 1);
                session.setAttribute("cart",cart);
                System.out.println(cartItem.toString());
            } else {
                Map<Long, Integer> cart = (Map)session.getAttribute("cart");
                System.out.println(cartItem.toString());
            }
        } else {
            result = 0;
        }
        System.out.println(cartItem.toString());
        return "ok";
    }
}
