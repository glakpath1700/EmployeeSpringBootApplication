package com.example.emp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.emp.beans.Employee;
import com.example.emp.repos.EmployeeRepository;
import com.example.emp.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;

	public EmployeeServiceImpl(EmployeeRepository empRRepository) {
		super();
		this.empRepo = empRRepository;
	}

	@Override public List<Employee> getAllEmployee()
    {
        return empRepo.findAll();
    }
 
    @Override public void save(Employee employee)
    {
        empRepo.save(employee);
    }
 
    @Override public Employee getById(Long id)
    {
        Optional<Employee> optional = empRepo.findById(id);
        Employee employee = null;
        if (optional.isPresent())
            employee = optional.get();
        else
            throw new RuntimeException(
                "Employee not found for id : " + id);
        return employee;
    }
 
    @Override public void deleteViaId(long id)
    {
        empRepo.deleteById(id);
    }
	
	

}
