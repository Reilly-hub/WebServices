package com.example.restservice.api;

import com.example.restservice.model.*;
import com.example.restservice.service.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class EmployeeController {

    @GetMapping("/employee")
    public List<Employee> getAllEmployees(){
        EmployeeService service = new EmployeeService();
        return service.getAllEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        EmployeeService service = new EmployeeService();
        List<Employee> employees = service.getAllEmployees();
        for(Employee e : employees){
            if(e.getId() == id)
                return e;
        }
        return null;
//        return employees.stream().filter(employee -> employee.getId() == id).findFirst().get();
    }
}