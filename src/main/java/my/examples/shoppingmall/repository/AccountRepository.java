package my.examples.shoppingmall.repository;

import my.examples.shoppingmall.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
