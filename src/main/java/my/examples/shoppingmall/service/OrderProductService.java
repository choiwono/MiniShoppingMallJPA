package my.examples.shoppingmall.service;

import lombok.RequiredArgsConstructor;
import my.examples.shoppingmall.domain.Order;
import my.examples.shoppingmall.domain.OrderProduct;
import my.examples.shoppingmall.domain.Product;
import my.examples.shoppingmall.repository.OrderProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderProductService {
    private final OrderProductRepository orderProductRepository;

    public void saveOrderProducts(List<Product> products) {
        OrderProduct orderProduct = new OrderProduct();
        for(Product pr : products){
            orderProduct.setAmount(pr.getAmount());
            orderProduct.setName(pr.getName());
            orderProduct.setTotalPrice(pr.getPrice()*pr.getAmount());
            orderProductRepository.save(orderProduct);
        }
    }
}
