package com.training.springboot.dthwebapp.repository;


import java.math.BigInteger;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Parameter;
import javax.persistence.ParameterMode;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;


import com.training.springboot.dthwebapp.model.Channel;
import com.training.springboot.dthwebapp.model.Customer;
import com.training.springboot.dthwebapp.model.CustomerSubscriptionChannel;
import com.training.springboot.dthwebapp.model.CustomerSubscriptionDetails;

@Repository
public class DthRepository {
	
	
	  @Autowired 
	  private EntityManager em;
	  
	 
	@Transactional
	@Modifying
	public Customer addNewCustomer(Customer customer) {
		StoredProcedureQuery query= em.createStoredProcedureQuery("addcustomer");
		
		
		query.registerStoredProcedureParameter("csubscriber_id", Long.class, ParameterMode.IN);
		query.registerStoredProcedureParameter("cfirst_name", String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter("clast_name", String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter("cregistered_mobile",Long.class, ParameterMode.IN);
	
		
		query.setParameter("csubscriber_id", customer.getSubscriber_id());
		query.setParameter("cfirst_name", customer.getFirst_name());
		query.setParameter("clast_name", customer.getLast_name());
		query.setParameter("cregistered_mobile", customer.getRegistered_mobile());
		
		query.execute();
		return customer;

	}
		

	@Transactional
	@Modifying
	public Channel addNewChannel(Channel channel) {
		StoredProcedureQuery query= em.createStoredProcedureQuery("addchannel");
		
		
		query.registerStoredProcedureParameter("channel_id", Integer.class, ParameterMode.IN);
		query.registerStoredProcedureParameter("channel_name", String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter("cost_per_month", Double.class, ParameterMode.IN);
		
		query.setParameter("channel_id", channel.getChannel_id());
		query.setParameter("channel_name", channel.getChannel_name());
		query.setParameter("cost_per_month", channel.getCost_per_month());
		
		query.execute();
		/*
		 * System.out.println("channel '"+channel.getChannel_name()+
		 * " ' with channel_idID " +channel.getChannel_id()+ " and cost " +
		 * channel.getCost_per_month() + " is added successfully");
		 */
		
		return channel;		
	}
	
	@Transactional
	@Modifying
	public CustomerSubscriptionChannel subscribeChannelRequest(CustomerSubscriptionChannel subscribeChannelRequest ) {
		
		
		StoredProcedureQuery query= em.createStoredProcedureQuery("subscribechannel");
		
		
		query.registerStoredProcedureParameter("id", Integer.class, ParameterMode.IN);
		query.registerStoredProcedureParameter("channel_id", Integer.class, ParameterMode.IN);
		query.registerStoredProcedureParameter("subscriber_id", Long.class, ParameterMode.IN);
		query.registerStoredProcedureParameter("subscriptionDate", String.class, ParameterMode.IN);
		
		
		query.setParameter("id", subscribeChannelRequest.getId());
		query.setParameter("channel_id", subscribeChannelRequest.getChannel_id());
		query.setParameter("subscriber_id", subscribeChannelRequest.getSubscriber_id());
		query.setParameter("subscriptionDate", subscribeChannelRequest.getSubscription_date());
		
		query.execute();
		
		return subscribeChannelRequest; 
		
		
	}

	@Transactional
	@Modifying
	public Long unSubscribeChannelRequest(Long subscriber_id, int channel_id) {
		
		StoredProcedureQuery query= em.createStoredProcedureQuery("unsubscribechannel");
		
		
		
		query.registerStoredProcedureParameter("subscriber_id", Long.class, ParameterMode.IN);
		query.registerStoredProcedureParameter("channel_id", Integer.class, ParameterMode.IN);
		
		
		query.setParameter("subscriber_id", subscriber_id);
		query.setParameter("channel_id", channel_id);
		
		query.executeUpdate();
		return subscriber_id; 
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Modifying
	public List viewSubscriptionChannelsRequest(Long subscriber_id) {		

		String subscriberid="select subscriber_id from customer where subscriber_id='"+subscriber_id+"'";
		String customerName = "select first_name from customer where subscriber_id='"+subscriber_id+"'";
		String total_subscription_cost="select sum(cost_per_month) from channel where channel_id in (select channel_id from customer_subscription_channel where subscriber_id ='"+subscriber_id+"')";
		String channelsSubscribed="select channel_name from channel where channel_id in (select channel_id from customer_subscription_channel where subscriber_id ='"+subscriber_id+"')";
		String cost_per_monthlist="select cost_per_month from channel where channel_id in (select channel_id from customer_subscription_channel where subscriber_id ='"+subscriber_id+"')";
		
		
		List customerSubscriptionDetails=new ArrayList<>();
		customerSubscriptionDetails.add("Subscriber ID : "+em.createNativeQuery(subscriberid).getSingleResult());
		customerSubscriptionDetails.add("Customer Name : "+em.createNativeQuery(customerName).getSingleResult());
		customerSubscriptionDetails.add("Total Subscription Cost : "+em.createNativeQuery(total_subscription_cost).getSingleResult());
		customerSubscriptionDetails.add("Channels Subscribed : "+em.createNativeQuery(channelsSubscribed).getResultList()+" cost_per_month : "+em.createNativeQuery(cost_per_monthlist).getResultList());
   	 	return customerSubscriptionDetails;
   	 
	
		
	}
	
	

	}
