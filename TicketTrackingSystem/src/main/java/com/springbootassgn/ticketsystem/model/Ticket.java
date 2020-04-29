package com.springbootassgn.ticketsystem.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;


/*
 * @NamedStoredProcedureQueries({
 * 
 * @NamedStoredProcedureQuery(name="sp_logTicket",procedureName =
 * "sp_logTicket"),
 * 
 * @NamedStoredProcedureQuery(name="sp_getAllTickets",procedureName =
 * "sp_getAllTickets")})
 */
@Entity
@Table(name="ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ticket_id")
	private int ticketId;
	@Column(name = "logged_by")
	private String loggedBy;
	@JsonFormat(pattern = "YYYY-MM-DD")
	@Column(name = "raised_date")
	private Date raisedDate;
	private String severity;
	@Column(name = "ticket_desc")
	private String ticketDesc;
	@Column(name = "resolved_by")
	private String resolvedBy;
	private String resolution;
	@JsonFormat(pattern = "DD-MM-YYYY")
	@Column(name = "resolved_date")
	private Date resolvedDate;
	private String status;
	
	
	public Ticket() {
		super();
	}
	
	
	public Ticket(int ticketId, String loggedBy, Date raisedDate, String severity, String ticketDesc,
			String resolvedBy, String resolution, Date resolvedDate, String status) {
		super();
		this.ticketId = ticketId;
		this.loggedBy = loggedBy;
		this.raisedDate = raisedDate;
		this.severity = severity;
		this.ticketDesc = ticketDesc;
		this.resolvedBy = resolvedBy;
		this.resolution = resolution;
		this.resolvedDate = resolvedDate;
		this.status = status;
	}


	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getLoggedBy() {
		return loggedBy;
	}
	public void setLoggedBy(String loggedBy) {
		this.loggedBy = loggedBy;
	}
	public Date getRaisedDate() {
		return raisedDate;
	}
	public void setRaisedDate(Date raisedDate) {
		this.raisedDate = raisedDate;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getTicketDesc() {
		return ticketDesc;
	}
	public void setTicketDesc(String ticketDesc) {
		this.ticketDesc = ticketDesc;
	}
	public String getResolvedBy() {
		return resolvedBy;
	}
	public void setResolvedBy(String resolvedBy) {
		this.resolvedBy = resolvedBy;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public Date getResolvedDate() {
		return resolvedDate;
	}
	public void setResolvedDate(Date resolvedDate) {
		this.resolvedDate = resolvedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
