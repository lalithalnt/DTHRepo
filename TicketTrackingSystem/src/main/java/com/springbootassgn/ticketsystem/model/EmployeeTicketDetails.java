package com.springbootassgn.ticketsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;

@Entity
@NamedStoredProcedureQuery(name="viewEmployeeTicketDetails",procedureName = "viewEmployeeTicketDetails")
public class EmployeeTicketDetails {
	
	
	private String empName;
	@Id
	private int ticket_id;
	private String severity;
	private double turnaroundTime;
	private String description;
	@Column(name = "resolved_by")
	private String resolvedBy;
	
	public EmployeeTicketDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeTicketDetails(String empName, int ticket_id, String severity, double turnaroundTime, String description,
			String resolvedBy) {
		super();
		this.empName = empName;
		this.ticket_id = ticket_id;
		this.severity = severity;
		this.turnaroundTime = turnaroundTime;
		this.description = description;
		this.resolvedBy = resolvedBy;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getTicket_id() {
		return ticket_id;
	}

	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public double getTurnAroundTime() {
		return turnaroundTime;
	}

	public void setTurnAroundTime(double turnaroundTime) {
		this.turnaroundTime = turnaroundTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getResolvedBy() {
		return resolvedBy;
	}

	public void setResolvedBy(String resolvedBy) {
		this.resolvedBy = resolvedBy;
	}
	
	
	
	
	

}
