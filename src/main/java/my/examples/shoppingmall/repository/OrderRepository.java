package my.examples.shoppingmall.repository;

import my.examples.shoppingmall.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
