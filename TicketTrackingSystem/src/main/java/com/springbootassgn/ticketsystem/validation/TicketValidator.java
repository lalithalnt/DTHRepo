package com.springbootassgn.ticketsystem.validation;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springbootassgn.ticketsystem.dao.TicketDao;
import com.springbootassgn.ticketsystem.exception.InvalidTicketIdException;
import com.springbootassgn.ticketsystem.model.Ticket;

@Component
public class TicketValidator {
	
	
	
	
	@Autowired
	TicketDao ticketDao;
	
	String response="";
	
	public String validateTicketId(int ticket_id,Ticket ticket)
	{
		if(ticketDao.findById(ticket_id).isPresent())
		{
			Ticket ticketStatus=ticketDao.findById(ticket_id).get();
			if(ticketStatus.getStatus().equals("CLOSED"))
			{
					throw new InvalidTicketIdException("Ticket "+ticket_id+" is already in 'CLOSED' status...please verify");
			}
			else {
				
				ticketStatus.setStatus("CLOSED");
				ticketStatus.setResolution(ticket.getResolution());
				ticketStatus.setResolvedBy(ticket.getResolvedBy());
				ticketStatus.setResolvedDate(new Date());
				System.out.println("Ticket "+ticket_id+" is 'CLOSED' successfully");
				ticketDao.save(ticketStatus);
	
			}
		}
		else {
			throw new InvalidTicketIdException("Invalid Ticket ID");
		}
			
		return response;
	}

}
