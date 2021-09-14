package com.OnetoMany.OneToMany_Uni.Repository;

import com.OnetoMany.OneToMany_Uni.Entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
}
