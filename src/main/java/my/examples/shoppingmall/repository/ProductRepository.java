package my.examples.shoppingmall.repository;

import my.examples.shoppingmall.domain.Product;
import my.examples.shoppingmall.domain.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query("SELECT p FROM Product p WHERE p.productCategory.id=:id")
    Page<Product> findProductByCategory(@Param("id") Long id, Pageable pageable);

    @Query("SELECT p FROM Product p inner join fetch p.productCategory " +
           "Order by p.id desc")
    List<Product> getFindAll();
    @Query("SELECT p FROM Product p WHERE p.id=:id")
    Product findProductById(@Param("id") Long id);
}
