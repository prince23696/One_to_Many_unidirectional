package com.OnetoMany.OneToMany_Uni.Controller;

import com.OnetoMany.OneToMany_Uni.Entity.Account;
import com.OnetoMany.OneToMany_Uni.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("getAccount/{id}")
    public Account getAccount(@PathVariable int id) {
        Account account = accountService.getAccount(id);
        return account;
    }

    @GetMapping("/getAccounts")
    public List<Account> getAll() {
        return accountService.getAll();
    }

    @PostMapping("/saveAccount")
    public Account addAccount(@RequestBody Account account) {
        accountService.addAccount(account);
        return account;
    }

    @DeleteMapping("/deleteAccount/{id}")
    public String deleteAccount(@PathVariable int id) {
        accountService.deleteAccount(id);
        return "item deleted form database id-" + id;
    }

    @PutMapping("/updateAccount/{id}")
    public Account updateAccount(@PathVariable int id, @RequestBody Account account) {
        accountService.updateAccount(id, account);
        return account;
    }
}