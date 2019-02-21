package my.examples.shoppingmall.controller;

import lombok.RequiredArgsConstructor;
import my.examples.shoppingmall.domain.Order;
import my.examples.shoppingmall.domain.Product;
import my.examples.shoppingmall.service.OrderProductService;
import my.examples.shoppingmall.service.OrderService;
import my.examples.shoppingmall.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    private final ProductService productService;
    private final OrderProductService orderProductService;

    @GetMapping("/writeform")
    public String orderWrite(Principal principal,
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

    @PostMapping("/buy")
    public String productBuy(@ModelAttribute Order order,
                             @RequestParam(name="productId") Long[] ids,
                             @RequestParam(name="amount") int[] amounts,
                                     Principal principal,
                                     Model model,
                                 HttpSession httpSession){

        String orderNumber = orderService.generateOrderNumber();
        order.setOrderNo(orderNumber);

        Map<Long,Integer> orderProduct = new HashMap<>();

        for(int i=0; i<ids.length; i++){
            orderProduct.put(ids[i],amounts[i]);
        }

        List<Product> products = productService.findMyProductList(orderProduct);
        Order saveOrder = orderService.saveOrder(order);
        orderProductService.saveOrderProducts(products,saveOrder);

        model.addAttribute("orderNo",orderNumber);
        return "order/complete";
    }

    @PostMapping("/directorder")
    public String directOrder(
            @RequestParam(name="id") Long id,
                                     int amount,
                                     Model model){
        Product product = productService.findByIdProduct(id);
        product.setAmount(amount);
        int totalPrice = amount * product.getPrice();
        model.addAttribute("product",product);
        model.addAttribute("totalPrice",totalPrice);
        return "order/directorder";
    }
}
