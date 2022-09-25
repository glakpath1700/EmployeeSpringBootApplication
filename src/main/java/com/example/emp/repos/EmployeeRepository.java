package com.example.emp.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.emp.beans.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
