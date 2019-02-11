package my.examples.shoppingmall.service;

import my.examples.shoppingmall.domain.Account;
import my.examples.shoppingmall.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    public List<Account> findAccountAll(){
        return accountRepository.findAll();
    }
}
