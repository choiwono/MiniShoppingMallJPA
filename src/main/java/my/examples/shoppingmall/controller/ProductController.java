package my.examples.shoppingmall.controller;

import lombok.RequiredArgsConstructor;
import my.examples.shoppingmall.domain.Product;
import my.examples.shoppingmall.repository.ProductRepository;
import my.examples.shoppingmall.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductRepository productRepository;

    @GetMapping("/view")
    public String view(
            @RequestParam(name="id",
                    required=false,defaultValue="false") Long id,
            Model model){
        Product product = productRepository.findProductById(id);
        model.addAttribute("product",product);
        return "product/view";
    }

    @GetMapping("/addCart")
    public String addCart(
            @RequestParam(name="id",
                    required=false,defaultValue="false") Long id,
            @CookieValue("myCart") String myCart,
            HttpServletResponse response){
        Product product = productRepository.findProductById(id);

        return "product/view";
    }
}
