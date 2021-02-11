package com.app.employee.spring.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.employee.spring.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	//@Query ("select e from Employee e where e.lastName=?1")
	//List<Employee> getAllEmployeeByLastName (String lastName);

}
