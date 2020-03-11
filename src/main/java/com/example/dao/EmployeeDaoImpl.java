package com.example.dao;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.exceptionHandler.EmployeeNotFoundException;
import com.example.bean.Employee;
import com.example.bean.UserRoleDto;
import com.example.repository.UserRepository;


@Service
public class EmployeeDaoImpl {
	
@Autowired

UserRepository userrepo;

	
	public Employee save(@Valid Employee p){
	 Employee e= userrepo.save(p);
	 
	 if(e==null) {
		 throw new EmployeeNotFoundException("Employee not found");
	 }
	return e;
		
	} 
	
	
	   public List<Employee> getEmployees()  throws EmployeeNotFoundException{
		   
		   List<Employee> e=(List<Employee>) userrepo.findAll();
		   if(e.size()==0) {
			   throw new EmployeeNotFoundException("Employee not save in the system");
			   
		   }
	        return e;
	    }
	   
	   
	   
	   public Optional<Employee> getEmployeebyId(Integer id) {
	        Optional<Employee> emp= userrepo.findById(id);
			return emp;
	       
	    }
	   
	   public List<UserRoleDto> getAllUsers(){
		 List<UserRoleDto> users = userrepo.getUserRolewithCount();
		return null;
		   
	   }


	
	
	
	
	

	
	
	
}
