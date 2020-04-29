package com.springbootassgn.ticketsystem.service;

import java.util.List;

import com.springbootassgn.ticketsystem.model.Ticket;

public interface TicketService {

	public String logTicket(Ticket ticket);
	public String deleteTicket(int tid);
	public List<Ticket> getAllTickets();
	public String closeTicket(int ticket_id,Ticket ticket);
}
