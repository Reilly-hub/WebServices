package com.example.restservice.service;

import com.example.restservice.model.*;

import java.util.*;

public class EmployeeService {

    public List<Employee> getAllEmployees(){
        Employee employee1 = new Employee(1, "Albert", "Augustus",new Address(25, "1st Ave",
                new City("Montreal", "Qc")) , "123456");
        Employee employee2 = new Employee(2, "Bernard", "Breadwinner",new Address(50, "2nd Boul",
                new City("Vaudreuil", "Qc")) , "654321");
        Employee employee3 = new Employee(3, "Christopher", "Columbus",new Address(75, "3rd Rd",
                new City("Hawkesbury", "On")) , "135790");

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        return employees;
    }
}