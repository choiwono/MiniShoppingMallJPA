package my.examples.shoppingmall.service;

import lombok.RequiredArgsConstructor;
import my.examples.shoppingmall.domain.Order;
import my.examples.shoppingmall.domain.Product;
import my.examples.shoppingmall.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> findAllProduct(){
        return productRepository.getFindAll();
    }

    public Product findByIdProduct(Long id){
        return productRepository.findProductById(id);
    }

    public List<Product> findMyProductList(Map<Long, Integer> cart) {
        List<Product> list = new ArrayList<>();
        for (Long key : cart.keySet()) {
            Product products = productRepository.findProductById(key);
            products.setAmount(cart.get(key));
            list.add(products);
        }
        return list;
    }

    public int findTotalPrice(List<Product> products) {
        int result = 0;
        for(Product pr : products){
            result += (pr.getPrice() * pr.getAmount());
        }
        return result;
    }
}
