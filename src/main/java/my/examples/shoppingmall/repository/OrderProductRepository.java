package my.examples.shoppingmall.repository;

import my.examples.shoppingmall.domain.OrderProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderProductRepository extends JpaRepository<OrderProduct,Long> {
    @Query("SELECT op FROM OrderProduct op left join fetch op.order" +
            " WHERE op.order.email1=:email")
    OrderProduct findUserOrderList(String email);
}
