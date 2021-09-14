package com.OnetoMany.OneToMany_Uni.Service;

import com.OnetoMany.OneToMany_Uni.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployee();

    public Employee getEmployee(int id);

    public String addEmployee(Employee employee);

    public Employee updatEmployee(int id, Employee employee);

    public String deleteEmployee(int id);
}
