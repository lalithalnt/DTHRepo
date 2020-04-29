package com.training.springboot.dthwebapp.exception;

@SuppressWarnings("serial")
public class InvalidChannelException extends Exception {
	
	String invalidChannelException;

	public InvalidChannelException(String invalidChannelException) {
		super(invalidChannelException);
		this.invalidChannelException = invalidChannelException;
		
		
	}
	
	

}
