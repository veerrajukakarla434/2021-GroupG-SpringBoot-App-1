package com.groupg.springboot.service;

import org.springframework.stereotype.Service;

import com.groupg.springboot.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee saveEmployee(Employee employee) {
		
		Employee empRespon = new Employee();
		empRespon.setId(employee.getId());
		empRespon.setName(employee.getName());
		empRespon.setAddress(employee.getAddress());
		
		return empRespon;
	}

}
