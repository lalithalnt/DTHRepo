package com.springbootassgn.ticketsystem.service.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springbootassgn.ticketsystem.dao.EmployeeDao;
import com.springbootassgn.ticketsystem.model.Employee;
import com.springbootassgn.ticketsystem.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	private EntityManager em;
	
	@Autowired
	EmployeeDao employeeDao;
	
	
	
	//we can use below procedure call to insert employee records
			public String insertEmployee(Employee employee) {
		
						employeeDao.save(employee);
						return "Record saved successfully";
		
			}


			public String deleteEmployee(String mID) {
						employeeDao.deleteById(mID);
						return "employee with "+mID+" deleted successfully";
				
			}
	
			public List<Employee> getemployeesList() {
						return employeeDao.findAll();
				  	 
			}


	/*
	 * public String insertEmployee(Employee employee) {
	 * 
	 * String response="";
	 * 
	 * StoredProcedureQuery query=
	 * em.createStoredProcedureQuery("sp_insert_employee");
	 * 
	 * 
	 * query.registerStoredProcedureParameter("sp_mid", String.class,
	 * ParameterMode.IN); query.registerStoredProcedureParameter("sp_department",
	 * String.class, ParameterMode.IN);
	 * query.registerStoredProcedureParameter("sp_empname", String.class,
	 * ParameterMode.IN);
	 * query.registerStoredProcedureParameter("sp_hiredate",Date.class,
	 * ParameterMode.IN);
	 * 
	 * 
	 * query.setParameter("sp_mid", employee.getmID());
	 * query.setParameter("sp_department", employee.getDept());
	 * query.setParameter("sp_empname", employee.getEmployeeName());
	 * query.setParameter("sp_hiredate", employee.getHireDate());
	 * 
	 * query.execute();
	 * response="' record inserted successfully in database by calling stored procedure"
	 * ; System.out.println("'"+employee.getEmployeeName() + response); return
	 * response;
	 * 
	 * }
	 */

	
	
	

}
