package com.springbootassgn.ticketsystem.service;

import java.util.List;


import com.springbootassgn.ticketsystem.model.Employee;

public interface EmployeeService {
	
	public String insertEmployee(Employee employee);
	public List<Employee> getemployeesList();
	public String deleteEmployee(String mID);

}
