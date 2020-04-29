package com.springbootassgn.ticketsystem.validation;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.springbootassgn.ticketsystem.exception.InvalidDateTimeException;

@Component
public class DateTimeValidator {
	
	public boolean validateDateTime(Date ticketRaisedDate ) {
	
		boolean response=true;
		Date systemDate=new Date();
		if(ticketRaisedDate.compareTo(systemDate)>0){
			response=false;
			throw new InvalidDateTimeException("Ticket raised date is not earlier than the system date..please enter valid date ");
		}
		
		return response;
		
		
	}

}
