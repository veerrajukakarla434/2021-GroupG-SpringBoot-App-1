package com.groupg.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.groupg.springboot.model.Employee;
import com.groupg.springboot.service.EmployeeService;

@RestController
public class EmployeeController {
	
	  @Autowired
	  EmployeeService service;

	  @PostMapping(value = "/employee")
	  public ResponseEntity<Object> saveEmployee(@RequestBody Employee emp){
		  
		  Employee response = service.saveEmployee(emp);
		  return new ResponseEntity<>(response, HttpStatus.CREATED);
	  }
}
