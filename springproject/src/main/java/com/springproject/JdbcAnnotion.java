package com.springproject;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springproject.dao.Departmentdao;
import com.springproject.dao.DepartmentdaoImplement;

@Configuration
public class JdbcAnnotion 
{
      //here is create your first method dataSource
	  //yaha per ham DataSource ki direct implements class DriverManagerDataSource ko liya hu
		/* 1 */
	  @Bean("driverMd")
	  public DataSource getDataSource() //method ka name hai getDtatSource
	  {
		  //yaha per hame DriverManagerDataSource ka object create karna hai
		  DriverManagerDataSource driverMd=new DriverManagerDataSource();
		  //here i set properties
		  driverMd.setDriverClassName("com.mysql.cj.jdbc.Driver");
		  driverMd.setUrl("jdbc:mysql://Localhost:3306/springjdbc");
		  driverMd.setUsername("root");
		  driverMd.setPassword("root");
		  return driverMd;
	  }
		/* 2 */
	  @Bean("jdbct")
	  public JdbcTemplate getJdbcTemplate() 
	  {
		  JdbcTemplate jdbctemplate=new JdbcTemplate();
		  jdbctemplate.setDataSource(getDataSource());
		  return jdbctemplate;
	  }
	  
		/* 3 */
	  @Bean("department_dao")
	  public Departmentdao getDepartmentdao() 
	  {
		  DepartmentdaoImplement departmentdao = new DepartmentdaoImplement();
		  departmentdao.setJdbctemplate(getJdbcTemplate());
		  return departmentdao;
		  
	  }
	
	  
}	  

