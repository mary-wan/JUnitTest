package com.kcbgroup.main.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kcbgroup.main.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	Optional<Employee> findByEmail(String email);

}
