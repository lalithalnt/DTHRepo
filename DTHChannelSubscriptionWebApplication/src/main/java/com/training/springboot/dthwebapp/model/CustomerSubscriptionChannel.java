package com.training.springboot.dthwebapp.model;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

@Entity
@NamedStoredProcedureQuery(name="addsubscribechannel",procedureName = "addsubscribechannel")
@NamedStoredProcedureQuery(name="unsubscribechannel",procedureName = "unsubscribechannel")
public class CustomerSubscriptionChannel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int id;
	private String subscription_date;
	@Size(max=3)
	private int channel_id; 
	private Long subscriber_id;
	
	public CustomerSubscriptionChannel()
	{
		System.out.println("SubscriptionChannel default constructor");
	}
	
	
	
	public CustomerSubscriptionChannel(int id, String subscription_date, int channel_id, Long subscriber_id,
			Channel channel) {
		super();
		this.id = id;
		this.subscription_date = subscription_date;
		this.channel_id = channel_id;
		this.subscriber_id = subscriber_id;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubscription_date() {
		return subscription_date;
	}
	public void setSubscription_date(String subscription_date) {
		this.subscription_date = subscription_date;
	}
	
	public int getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(int channel_id) {
		this.channel_id = channel_id;
	}
	public Long getSubscriber_id() {
		return subscriber_id;
	}
	public void setSubscriber_id(Long subscriber_id) {
		this.subscriber_id = subscriber_id;
	}

	public String isEmpty() {
		// TODO Auto-generated method stub
		
		return null;
	}
	
	
}
