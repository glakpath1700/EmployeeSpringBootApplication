package com.example.emp.service;

import java.util.List;

import com.example.emp.beans.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);
    void deleteViaId(long id);
	
}
