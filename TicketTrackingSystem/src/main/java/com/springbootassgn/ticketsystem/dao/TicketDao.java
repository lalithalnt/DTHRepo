package com.springbootassgn.ticketsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootassgn.ticketsystem.model.Ticket;

@Repository
public interface TicketDao extends JpaRepository<Ticket, Integer> {
	

	//public String saveTicket(Ticket ticket);
	//public List<Ticket> getAllTickets();
}
