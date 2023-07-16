package com.springproject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springproject.entity.Department;

public class RowMapperImp implements RowMapper<Department>{

	public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Department departmenta=new Department();
	    departmenta.setDp_id(rs.getInt(1));
	    departmenta.setDp_name(rs.getString(2));
	    departmenta.setDp_name(rs.getString(3));
	    departmenta.setDp_name(rs.getString(3));
		return departmenta;
		
	}

}
