package com.employeesapp.task.service;
import java.util.List;
import com.employeesapp.task.model.Employee;

public interface EmployeeService {
    Iterable<Employee> findAll();

    List<Employee> search(String q);

    Employee findOne(int id);

    void save(Employee contact);

    void delete(int id);
}