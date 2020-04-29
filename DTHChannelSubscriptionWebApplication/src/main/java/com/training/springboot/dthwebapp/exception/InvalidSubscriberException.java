package com.training.springboot.dthwebapp.exception;

@SuppressWarnings("serial")
public class InvalidSubscriberException extends Exception {
	
	String invalidSubscriberException;
	
	public InvalidSubscriberException(String invalidSubscriberException){
		super(invalidSubscriberException);
		this.invalidSubscriberException=invalidSubscriberException;
		
		
	}
	

}
