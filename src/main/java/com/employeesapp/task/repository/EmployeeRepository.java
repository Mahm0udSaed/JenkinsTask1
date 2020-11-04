package com.employeesapp.task.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.employeesapp.task.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    List<Employee> findByNameContaining(String q);

}