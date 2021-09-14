package com.OnetoMany.OneToMany_Uni.Service;

import com.OnetoMany.OneToMany_Uni.Entity.Account;
import com.OnetoMany.OneToMany_Uni.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public List<Account> getAll() {
        return (List<Account>) accountRepository.findAll();
    }

    @Override
    public Account getAccount(int id) {
        return accountRepository.findById(id).get();
    }

    @Override
    public String addAccount(Account account) {
        accountRepository.save(account);
        return "Account Added Successfully";
    }

    @Override
    public Account updateAccount(int id, Account account) {
        Account account1 = accountRepository.findById(id).get();
        account1.setAccount_Number(account.getAccount_Number());
        return account1;
    }

    @Override
    public String deleteAccount(int id) {
        accountRepository.deleteById(id);
        return "Account deleted from database id=" + id;
    }
}
