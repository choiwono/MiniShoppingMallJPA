package my.examples.shoppingmall.controller.api;

import lombok.RequiredArgsConstructor;
import my.examples.shoppingmall.domain.Account;
import my.examples.shoppingmall.domain.Product;
import my.examples.shoppingmall.dto.CartItem;
import my.examples.shoppingmall.dto.OrderItem;
import my.examples.shoppingmall.service.AccountService;
import my.examples.shoppingmall.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/account")
@RequiredArgsConstructor
public class AccountApiController {
    private final AccountService accountService;

    @PostMapping(value="/addWishItem")
    public String addWishItem(@RequestBody CartItem cartItem,
                                    Principal principal,
                                    HttpSession session){
        String result = "";
        if(principal != null){
            Account account = accountService.findAccountByEmail(principal.getName());

        }
        return "ok";
    }
}