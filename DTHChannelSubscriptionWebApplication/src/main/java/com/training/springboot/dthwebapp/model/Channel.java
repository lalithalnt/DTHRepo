package com.training.springboot.dthwebapp.model;


import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

@Entity
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name="addchannel",procedureName = "addchannel"),
	@NamedStoredProcedureQuery(name="findChannelByID",procedureName = "findChannelByID")})
public class Channel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int channel_id;
	private String channel_name;
	private Double cost_per_month;

	public Channel() {
		System.out.println("Channel default constructor");
	}

	public Channel(int channel_id, String channel_name, Double cost_per_month) {
		super();
		this.channel_id = channel_id;
		this.channel_name = channel_name;
		this.cost_per_month = cost_per_month;
		
	}

	public int getChannel_id() {
		return channel_id;
	}

	public void setChannel_id(int channel_id) {
		this.channel_id = channel_id;
	}

	public String getChannel_name() {
		return channel_name;
	}

	public void setChannel_name(String channel_name) {
		this.channel_name = channel_name;
	}

	public Double getCost_per_month() {
		return cost_per_month;
	}

	public void setCost_per_month(Double cost_per_month) {
		this.cost_per_month = cost_per_month;
	}

	

	@Override
	public String toString() {
		return "Channel [channel_id=" + channel_id + ", channel_name=" + channel_name + ", cost_per_month="
				+ cost_per_month +"]";
	}
	
	
	
}
