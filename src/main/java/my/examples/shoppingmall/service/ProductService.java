package my.examples.shoppingmall.service;

import lombok.RequiredArgsConstructor;
import my.examples.shoppingmall.domain.Order;
import my.examples.shoppingmall.domain.Product;
import my.examples.shoppingmall.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    @Transactional(readOnly = true)
    public List<Product> findAllProduct(){
        return productRepository.getFindAll();
    }

    @Transactional(readOnly = true)
    public Product findByIdProduct(Long id){
        return productRepository.findProductById(id);
    }

    @Transactional
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
