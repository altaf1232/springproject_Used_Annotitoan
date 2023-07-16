package com.springproject.dao;



import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springproject.entity.Department;

public class DepartmentdaoImplement implements Departmentdao
{
   
	 //here is Departmentdao interface implemention work
	//here is difine may jdbctemplet
	private JdbcTemplate jdbctemplate;
	public int insert(Department department) {
		//here i am creating insert query
     String query="insert into Department(dp_id,dp_name,dp_address,dp_branch)value(?,?,?,?)";
     int r =this.jdbctemplate.update(query,department.getDp_id(),department.getDp_name()
    		 ,department.getDp_address(),department.getDp_branch());
		return r;
	}
	
	
	  //here is implement your update query change method
	   public int change(Department  department1) 
	   {
	   // here is updating data String
	 String query1="update Department set dp_name=?,dp_address=?,dp_branch=? where dp_id=?";
	 int r1= this.jdbctemplate.update(query1,department1.getDp_name(),department1.
	 getDp_address(),department1.getDp_branch() ,department1.getDp_id()); return
	  r1; 
	 }
	  //here is your delete query
	   public int delete(int department_id) {
			String query2="delete from Department where dp_id=?";
		int r2=	this.jdbctemplate.update(query2,department_id);
			return r2;
		}
     //here is your select query
	   public Department getDepartment(int departments_id) {
		 String query3="Select * from Department where dp_id=?";
		   //here is create class
		    RowMapper<Department>rowMapper=new RowMapperImp();
		    Department department=this.jdbctemplate.queryForObject(query3, rowMapper,departments_id);
			return department;
			//rowMapper interface ka eaak class bana padega Departmentdao me 
		} 
	   
	   //here is your select all query
	   public List<Department> getAllDepartments() {
	    String query4="Select * from Department";
	         List<Department>department_b=this.jdbctemplate.query(query4,new RowMapperImp());
			return department_b;
		}
	   
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

}
