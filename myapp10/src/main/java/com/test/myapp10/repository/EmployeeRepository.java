package com.test.myapp10.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.myapp10.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    public Employee findByUsername(String username);
}
