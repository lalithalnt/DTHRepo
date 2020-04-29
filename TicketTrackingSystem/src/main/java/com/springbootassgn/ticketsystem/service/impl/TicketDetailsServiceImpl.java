package com.springbootassgn.ticketsystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootassgn.ticketsystem.dao.impl.EmployeeTicketDetailsDaoImpl;

import com.springbootassgn.ticketsystem.model.EmployeeTicketDetails;
import com.springbootassgn.ticketsystem.service.TicketDetailsService;


@Service
public class TicketDetailsServiceImpl implements TicketDetailsService {

	@Autowired
	EmployeeTicketDetailsDaoImpl employeeTicketDetailsDaoImpl;
	
	public List<EmployeeTicketDetails> viewTicketDetails() {
		
		return employeeTicketDetailsDaoImpl.getEmployeeTicketDetails();
	}

}
