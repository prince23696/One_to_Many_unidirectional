package com.OnetoMany.OneToMany_Uni.Service;

import com.OnetoMany.OneToMany_Uni.Entity.Account;

import java.util.List;

public interface AccountService {

    public List<Account> getAll();

    public Account getAccount(int id);

    public String addAccount(Account account);

    public Account updateAccount(int id, Account account);

    public String deleteAccount(int id);

}
