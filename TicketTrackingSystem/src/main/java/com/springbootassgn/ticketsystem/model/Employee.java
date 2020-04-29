package com.springbootassgn.ticketsystem.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="employee")
@NamedStoredProcedureQuery(name="sp_insert_employee",procedureName = "sp_insert_employee")
public class Employee  {
	
	@Id
	@Column(name = "mid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String mID;
	@Column(name = "Employee_Name",nullable = false)
	private String employeeName;
	@JsonFormat(pattern = "DD-MM-YYYY")
	@Column(name = "Hire_Date",nullable = false)
	private Date hireDate;
	@Column(name = "Department",nullable = false)
	private String dept;
	
	
	
	
	public Employee() {
		super();
	}
	
	
	public Employee(String mID, String employeeName, Date hireDate, String dept) {
		super();
		this.mID = mID;
		this.employeeName = employeeName;
		this.hireDate = hireDate;
		this.dept = dept;
	}


	public String getmID() {
		return mID;
	}
	public void setmID(String mID) {
		this.mID = mID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	

}
