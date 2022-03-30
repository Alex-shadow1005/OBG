package com.example.obg.repository;

import com.example.obg.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

  @Query(value = "select * from employee e where e.email = ? AND e.password = ?" , nativeQuery = true)

  Optional<Employee> findByEmailAndPassword(String email, String password);
}
