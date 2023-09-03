package com.dsenvolvendosistemas.teste.dao;

import com.dsenvolvendosistemas.teste.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
