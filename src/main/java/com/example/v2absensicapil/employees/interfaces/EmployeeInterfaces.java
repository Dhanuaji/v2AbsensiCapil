package com.example.v2absensicapil.employees.interfaces;

import com.example.v2absensicapil.employees.entities.Employees;

public interface EmployeeInterfaces {
    public Employees findByMail(String email);
    public Iterable<Employees> getAll();
    public Employees save(Employees emp);
    public boolean checkNik(String nik);
}
