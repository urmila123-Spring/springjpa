	package com.example.controller;
	
	import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.exceptionHandler.EmployeeNotFoundException;
import com.example.bean.Employee;
import com.example.dao.EmployeeDaoImpl;
	
@RestController

public class EmployeeSaveController {
	
	@Autowired
	EmployeeDaoImpl service;
	
	
	  @PostMapping("/saveemployee")
	    public Employee postEmployee(@RequestBody Employee emp) {
	        
			return  service.save(emp);
	    }
	  
	  
	  @PostMapping("/getEmployee")
	  public List<Employee> getEmployees() throws EmployeeNotFoundException {
	        return service.getEmployees();
	    }
	  
	  
	  
	  @GetMapping("/getByid/{id}")
	    public Optional<Employee> getById(@PathVariable ("user") String user,@PathVariable(required = true) int id) {
			
		return service.getEmployeebyId(id);
			
	    }


	
	
}