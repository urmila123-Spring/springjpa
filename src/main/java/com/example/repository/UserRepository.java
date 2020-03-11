package com.example.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.bean.Employee;
import com.example.bean.UserRoleDto;

public interface UserRepository extends CrudRepository<Employee, Integer> {
	
	
	@Query("from Employee")
	public List<Employee>   getEmployee();
	
	@Query(value="select USER_ROLE  as role ,count(*) as count from user group by USER_ROLE",nativeQuery=true)
	public List<Map<String,Object> >  getUserwithNativequery();
	
	@Query("select new com.example.bean.UserRoleDto(us.userRole,us.count) userRole,count(*) from user us" )
	
	public  List<UserRoleDto> getUserRolewithCount();
	
	
	
		
	
	
	

}
