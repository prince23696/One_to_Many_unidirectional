package com.OnetoMany.OneToMany_Uni.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int account_Id;
    private String account_Number;

    public Account() {
    }

    public Account(int account_Id, String account_Number) {
        this.account_Id = account_Id;
        this.account_Number = account_Number;
    }

    public int getAccount_Id() {
        return account_Id;
    }

    public void setAccount_Id(int account_Id) {
        this.account_Id = account_Id;
    }

    public String getAccount_Number() {
        return account_Number;
    }

    public void setAccount_Number(String account_Number) {
        this.account_Number = account_Number;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account_Id=" + account_Id +
                ", account_Number='" + account_Number + '\'' +
                '}';
    }
}
