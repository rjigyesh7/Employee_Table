package com.app.employee.spring.service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.app.employee.spring.model.Employee;

public class EmployeeService {

	private int idcount = 1;
	private List<Employee> employeeList = new CopyOnWriteArrayList<>();
	
	public Employee addEmployee(Employee employee) {
		employee.setId(idcount);
		employeeList.add(employee);
		employeeList.add(employee);
		idcount++;
		return employee;
	}
	
	public List<Employee> getEmployees() {
		return employeeList;
	}
	
	public Employee getEmployee(int id) {
		return employeeList
				.stream()
				.filter(e -> e.getId() == id)
				.findFirst()
				.get();
		
	}
	
	public Employee updateEmployee(int id, Employee employee) {
		
		employeeList
				.stream()
				.forEach(e -> {
					if(e.getId() == id) {
						e.setFirstName(employee.getFirstName());
						e.setLastName(employee.getLastName());
						e.setEmailId(employee.getEmailId());
						e.setContactNumber(employee.getContactNumber());
				}
			});
		
		return employeeList
				.stream()
				.filter(e -> e.getId() == id)
				.findFirst()
				.get();
	}
	
	public void deleteEmployee(int id) {
		
		employeeList
				.stream()
				.forEach(e -> {
					if(e.getId() == id) {
						employeeList.remove(e);
				}
			});
	}
	
}
