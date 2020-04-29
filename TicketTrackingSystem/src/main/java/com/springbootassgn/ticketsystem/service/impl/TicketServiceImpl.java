package com.springbootassgn.ticketsystem.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springbootassgn.ticketsystem.dao.TicketDao;
import com.springbootassgn.ticketsystem.exception.InvalidTicketIdException;
import com.springbootassgn.ticketsystem.model.Ticket;
import com.springbootassgn.ticketsystem.service.TicketService;
import com.springbootassgn.ticketsystem.validation.DateTimeValidator;
import com.springbootassgn.ticketsystem.validation.TicketValidator;


@Service
public class TicketServiceImpl implements TicketService {


	@Autowired 
	TicketDao ticketDao;
	
	@Autowired
	DateTimeValidator dateTimeValidator;
	
	@Autowired
	TicketValidator ticketValidator;
	
	String response="";

	public String logTicket(Ticket ticket) {
		if(dateTimeValidator.validateDateTime(ticket.getRaisedDate())) {
			response="Ticket logged successfully";
			ticket.setStatus("Open");
			ticketDao.save(ticket);
		}
		return response;
		
	}
	
	public String deleteTicket(int tid) {
		ticketDao.deleteById(tid);
		return "Ticket with "+tid+" deleted successfully";

}

	
	public List<Ticket> getAllTickets() {
		
		return ticketDao.findAll();
		
		
	}

	
	public String closeTicket(int ticket_id,Ticket ticket) {
	
		ticketValidator.validateTicketId(ticket_id, ticket);
		return response;
		
	
		
		
			
		
		
	}

}
