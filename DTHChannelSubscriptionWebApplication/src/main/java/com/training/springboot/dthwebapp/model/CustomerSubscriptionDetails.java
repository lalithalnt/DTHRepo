package com.training.springboot.dthwebapp.model;

import java.util.List;

import javax.persistence.NamedStoredProcedureQuery;



public class CustomerSubscriptionDetails {
	
	private Long subscriptionId;
	private String customerName;
	private List<Channel> channels_Subscribed_For;
	private double total_subscription_cost;
	
	public Long getSubscriptionId() {
		return subscriptionId;
	}
	public void setSubscriptionId(Long subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public List<Channel> getChannels_Subscribed_For() {
		return channels_Subscribed_For;
	}
	public void setChannels_Subscribed_For(List<Channel> channels_Subscribed_For) {
		this.channels_Subscribed_For = channels_Subscribed_For;
	}
	public double getTotal_subscription_cost() {
		return total_subscription_cost;
	}
	public void setTotal_subscription_cost(double total_subscription_cost) {
		this.total_subscription_cost = total_subscription_cost;
	}
	public boolean isPresent() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
