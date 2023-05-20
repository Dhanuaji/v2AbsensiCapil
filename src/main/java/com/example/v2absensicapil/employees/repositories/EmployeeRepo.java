package com.example.v2absensicapil.employees.repositories;

import com.example.v2absensicapil.employees.entities.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employees, String> {

    @Query(value = "SELECT * FROM employees WHERE email=?1", nativeQuery = true)
    public boolean checkEmail(String email);

    @Query(value = "SELECT * FROM employees WHERE email=?1", nativeQuery = true)
    public Employees getEmail(String email);
}
