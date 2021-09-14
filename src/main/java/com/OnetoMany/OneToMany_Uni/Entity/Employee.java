package com.OnetoMany.OneToMany_Uni.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_id;
    private String f_name;
    private String l_name;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Account> accounts;

    public Employee() {
    }

    public Employee(int emp_id) {
        this.emp_id = emp_id;
    }

    public Employee(int emp_id, String f_name, String l_name, List<Account> accounts) {
        this.emp_id = emp_id;
        this.f_name = f_name;
        this.l_name = l_name;
        this.accounts = accounts;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", f_name='" + f_name + '\'' +
                ", l_name='" + l_name + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
