package my.examples.shoppingmall.controller;

import lombok.RequiredArgsConstructor;
import my.examples.shoppingmall.domain.Product;
import my.examples.shoppingmall.service.OrderService;
import my.examples.shoppingmall.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    private final ProductService productService;

    @GetMapping("/writeform")
    public String buy(Principal principal,
                      HttpSession session,
                      Model model){
        if(session.getAttribute("cart") != null) {
            Map<Long, Integer> cart = (Map) session.getAttribute("cart");
            List<Product> products = productService.findMyProductList(cart);
            int totalPrice = productService.findTotalPrice(products);

            model.addAttribute("products",products);
            model.addAttribute("totalPrice",totalPrice);
        }
        return "order/writeform";
    }
}
