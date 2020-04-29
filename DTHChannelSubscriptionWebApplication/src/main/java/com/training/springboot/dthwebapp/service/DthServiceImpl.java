package com.training.springboot.dthwebapp.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.training.springboot.dthwebapp.model.Channel;
import com.training.springboot.dthwebapp.model.Customer;
import com.training.springboot.dthwebapp.model.CustomerSubscriptionChannel;
import com.training.springboot.dthwebapp.model.CustomerSubscriptionDetails;
import com.training.springboot.dthwebapp.repository.DthRepository;

@Service
public class DthServiceImpl implements DthService {

	@Autowired
	private DthRepository dthRepository;
	
	public Customer addNewCustomer(Customer customer) {
		dthRepository.addNewCustomer(customer);
		System.out.println(customer.getFirst_name() + " is registerd successfully with DTH Subscription WebApp");
		return customer;
		
	}

	
	public Channel addNewChannel(Channel channel) {
		dthRepository.addNewChannel(channel);
		System.out.println("channel '"+channel.getChannel_name()+ "and cost " 
				+ channel.getCost_per_month() + " is added successfully");
		return channel;
		
	}
	

	public CustomerSubscriptionChannel subscribeChannelRequest(CustomerSubscriptionChannel subscribeChannelRequest ) {
		dthRepository.subscribeChannelRequest(subscribeChannelRequest);
		return subscribeChannelRequest;
		
	}

	public String unSubscribeChannelRequest(Long subscriber_id, int channel_id) {
		dthRepository.unSubscribeChannelRequest(subscriber_id,channel_id);
		String response="channel is unsubscribed : "+channel_id;
		System.out.println(response);
		return response;
		
	}
	
	public List viewSubscriptionChannelsRequest(Long subscriber_id) {
	
	String serviceResponse="view subscription details - in service";
	System.out.println(serviceResponse);
	return dthRepository.viewSubscriptionChannelsRequest(subscriber_id);
	
	}


	
}
