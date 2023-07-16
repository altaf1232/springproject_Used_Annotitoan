package com.springproject.dao;

import java.util.List;

import com.springproject.entity.Department;

public interface Departmentdao 
{
	//this is your insert method
   public int insert(Department department) ;
   
	
	 //this is your update method public 
   int change(Department department1);
   
   //this is your delete method
   
    int delete(int department_id);
    
    //here is your select method
    public List<Department> getAllDepartments();
}
