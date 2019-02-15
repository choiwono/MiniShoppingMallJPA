package my.examples.shoppingmall.controller.api;

import my.examples.shoppingmall.dto.CartItem;
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
        String result = "fail";

        if(session.getAttribute("cart") == null) {
            Map<Long, Integer> cart = new HashMap<>();
            cart.put(cartItem.getProductId(), cartItem.getQuantity());
            session.setAttribute("cart",cart);
            result = "success";

        } else {
            Map<Long, Integer> cart = (Map)session.getAttribute("cart");
            if(cart.containsKey(cartItem.getProductId())){
                result = "duplicate";
            } else {
                cart.put(cartItem.getProductId(), cartItem.getQuantity());
                session.setAttribute("cart",cart);
                result = "success";
            }
        }
        return result;
    }
}
