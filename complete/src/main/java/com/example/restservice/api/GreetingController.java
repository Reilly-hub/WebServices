package com.example.restservice.api;

import java.util.concurrent.atomic.AtomicLong;

import com.example.restservice.model.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "Reilly") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	@GetMapping("/test")
	public String test(){
		return "Hello myself";
	}
//	@GetMapping("/employee")
//	public Employee getEmployee(@RequestParam(value = "employeeid", defaultValue = "1") int id,
//								@RequestParam(value = "firstname", defaultValue = "Albert") String fname,
//								@RequestParam(value = "lastname", defaultValue = "Augustus") String lname){
////								@RequestParam(value = "employeeaddress") Address address){
//
//		return new Employee(id, fname, lname);
////		return new Employee(1, "Albert", "Augustus", new Address(10, "1st Ave", "Montreal","Qc"));
//	}
//
//	@PostMapping("/employee")
//	public String createEmployee(@RequestBody Employee employee) {
//		System.out.println(employee);
//		return "employee is created";
//	}
}