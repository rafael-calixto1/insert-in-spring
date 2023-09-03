package com.dsenvolvendosistemas.teste.dao;

import com.dsenvolvendosistemas.teste.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
    //field for entity manager
    private EntityManager entityManager;
    //set up constructor injection
    @Autowired
    public EmployeeDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }
    @Override
    public List<Employee> findAll(){
        //create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);
        //Execute query and get result list
        List<Employee> employees = theQuery.getResultList();
        //return the results
        return employees;
    }
}
