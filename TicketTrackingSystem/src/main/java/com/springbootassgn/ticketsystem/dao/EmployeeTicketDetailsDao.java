package com.springbootassgn.ticketsystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootassgn.ticketsystem.model.EmployeeTicketDetails;

public interface EmployeeTicketDetailsDao extends JpaRepository<EmployeeTicketDetails, Integer> {
	
	public List<EmployeeTicketDetails> getEmployeeTicketDetails();

}
