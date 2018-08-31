package com.sandbox.datademo.repository;

import org.springframework.data.repository.CrudRepository;
import com.sandbox.datademo.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    Employee findByFirstName(String firstName);

}
