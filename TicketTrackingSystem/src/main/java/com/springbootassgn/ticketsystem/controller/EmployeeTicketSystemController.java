package com.springbootassgn.ticketsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springbootassgn.ticketsystem.dao.TicketDao;
import com.springbootassgn.ticketsystem.model.Employee;
import com.springbootassgn.ticketsystem.model.Ticket;
import com.springbootassgn.ticketsystem.model.EmployeeTicketDetails;
import com.springbootassgn.ticketsystem.service.impl.EmployeeServiceImpl;
import com.springbootassgn.ticketsystem.service.impl.TicketDetailsServiceImpl;
import com.springbootassgn.ticketsystem.service.impl.TicketServiceImpl;

@RestController
@RequestMapping(path = "/ticketsystem")
public class EmployeeTicketSystemController {
	
	/*
	 * @Autowired TicketDAODemo dao;
	 */
	/* http://localhost:8084/ticketsystem */
	
	@Autowired
	EmployeeServiceImpl employeeService;
	
	@Autowired
	TicketServiceImpl ticketService;
	
	@Autowired
	TicketDetailsServiceImpl ticketDetailsServiceImpl;
	
	
	
	
	String response="";
	
	
	//to insert/save employee in table using stored procedure
	
	@PostMapping(path = "/insertemployee")
	public String insertEmployee(@RequestBody Employee employee)
	{
		employeeService.insertEmployee(employee);
		response="'"+employee.getEmployeeName() +"' record inserted successfully in database by calling stored procedure";
		return response;
	}

	//to fetch all employees
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getemployeesList()
	{
		
		List<Employee> employeesList=employeeService.getemployeesList();
		return employeesList;
		
		
	}
	
	@DeleteMapping("/deleteemp/{emp_mid}")
	public String deleteEmployee(@PathVariable("emp_mid") String mID)
	{
		
		employeeService.deleteEmployee(mID);
		return "employee with "+mID+" deleted successfully";
		
	}
	
	@PostMapping("/logTicket")
	public String logTicket(@RequestBody Ticket ticket) {
		ticketService.logTicket(ticket);
		return response="Ticket raised/logged by "+ticket.getLoggedBy()+" successfully";
		
	}
	
	@DeleteMapping("/deletetic/{tic_id}")
	public String deleteTicket(@PathVariable("tic_id") int tid) {
		ticketService.deleteTicket(tid);
		return "Ticket with "+tid+" deleted successfully";
	}
	
	
	@GetMapping("/getAllTickets")
	public List<Ticket> getAllTickets(){
		List<Ticket> list= ticketService.getAllTickets();
		return list;
			
		}
	
	@PutMapping("/closeTicket/{ticketid}")
	public String closeTicket(@PathVariable("ticketid") int ticket_id,@RequestBody Ticket ticket) {
		response="Ticket "+	ticket_id + " is closed";
		ticketService.closeTicket(ticket_id,ticket);
		return response;
		
		
	}
	
	@GetMapping("/viewTicketDetails")
	public List<EmployeeTicketDetails> viewTicketDetails(){
		
		return ticketDetailsServiceImpl.viewTicketDetails();
		
	}


}


