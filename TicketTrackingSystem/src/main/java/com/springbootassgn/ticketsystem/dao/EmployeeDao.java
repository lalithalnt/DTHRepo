package com.springbootassgn.ticketsystem.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import com.springbootassgn.ticketsystem.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, String> {
	
	/*
	 * @Procedure(name="sp_insert_employee") public String insertEmployee(Employee
	 * employee);
	 */
	


}
