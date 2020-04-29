package com.example.kafkaproducer.model;

public class User {

	private String name;
	private String desig;
	private Long salary;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String desig, Long salary) {
		super();
		this.name = name;
		this.desig = desig;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
	
}
