package com.OnetoMany.OneToMany_Uni.Repository;

import com.OnetoMany.OneToMany_Uni.Entity.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account,Integer> {
}
