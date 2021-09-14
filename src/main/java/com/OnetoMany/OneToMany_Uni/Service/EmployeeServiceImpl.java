package com.OnetoMany.OneToMany_Uni.Service;

import com.OnetoMany.OneToMany_Uni.Entity.Employee;
import com.OnetoMany.OneToMany_Uni.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployee() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(int id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public String addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Employee Added Successfully";
    }

    @Override
    public Employee updatEmployee(int id, Employee employee) {
        Employee employee1 = employeeRepository.findById(id).get();
        employee1.setF_name(employee.getF_name());
        employee1.setL_name(employee.getL_name());
//        Account account= employee1.getAccounts().get();
//        account.setAccount_Number(employee.getAccounts().g);
        employee1.setAccounts(employee.getAccounts());
        return employee1;
    }

    @Override
    public String deleteEmployee(int id) {
        employeeRepository.deleteById(id);
        return "Employee Deleted Successfully id=" + id;
    }
}
