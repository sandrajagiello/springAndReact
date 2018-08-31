package com.sandbox.datademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sandbox.datademo.model.Employee;
import com.sandbox.datademo.repository.EmployeeRepository;


@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        Employee employee1 = new Employee("John", "Doe", "desc1");
        repository.save(employee1);

        Employee employee2 = new Employee("Greg", "Brown", "desc2");
        repository.save(employee2);

        Employee employee3 = new Employee("Jane", "Doe", "desc3");
        repository.save(employee3);

        Employee found1 = repository.findByFirstName("John");
        System.out.println("Znaleziono: " + found1);
    }
}