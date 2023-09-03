package com.dsenvolvendosistemas.teste.rest;

import com.dsenvolvendosistemas.teste.dao.EmployeeDAO;
import com.dsenvolvendosistemas.teste.entity.Employee;
import com.dsenvolvendosistemas.teste.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cw")
public class EmployeeRestController {
    private EmployeeService employeeService;

    //quick and dirty: inject employee dao using constructor injection
    public EmployeeRestController(EmployeeService theEmployeeService){

        employeeService = theEmployeeService;
    }
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

}
