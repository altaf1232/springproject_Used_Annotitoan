package com.springproject.entity;

public class Department 
{
   private int dp_id;
   private String dp_name;
   private String dp_address;
   private String dp_branch;
public int getDp_id() {
	return dp_id;
}
public void setDp_id(int dp_id) {
	this.dp_id = dp_id;
}
public String getDp_name() {
	return dp_name;
}
public void setDp_name(String dp_name) {
	this.dp_name = dp_name;
}
public String getDp_address() {
	return dp_address;
}
public void setDp_address(String dp_address) {
	this.dp_address = dp_address;
}
public String getDp_branch() {
	return dp_branch;
}
public void setDp_branch(String dp_branch) {
	this.dp_branch = dp_branch;
}
public Department(int dp_id, String dp_name, String dp_address, String dp_branch) {
	super();
	this.dp_id = dp_id;
	this.dp_name = dp_name;
	this.dp_address = dp_address;
	this.dp_branch = dp_branch;
}
public Department() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Department [dp_id=" + dp_id + ", dp_name=" + dp_name + ", dp_address=" + dp_address + ", dp_branch="
			+ dp_branch + "]";
}
   
}
