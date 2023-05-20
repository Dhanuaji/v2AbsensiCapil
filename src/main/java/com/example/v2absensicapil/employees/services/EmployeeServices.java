package com.example.v2absensicapil.employees.services;

import com.example.v2absensicapil.employees.entities.Employees;
import com.example.v2absensicapil.employees.interfaces.EmployeeInterfaces;
import com.example.v2absensicapil.employees.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServices implements EmployeeInterfaces {

    @Autowired
    private EmployeeRepo empRepo;

    @Override
    public Employees findByMail(String email) {
        return empRepo.getEmail(email);
    }

    @Override
    public Iterable<Employees> getAll() {
        return empRepo.findAll();
    }

    @Override
    public Employees save(Employees emp) {
        return empRepo.save(emp);
    }

    @Override
    public boolean checkNik(String nik) {
        return empRepo.existsById(nik);
    }
}
