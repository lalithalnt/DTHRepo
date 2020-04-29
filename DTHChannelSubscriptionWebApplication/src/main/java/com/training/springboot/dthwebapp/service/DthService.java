package com.training.springboot.dthwebapp.service;


import java.math.BigInteger;
import java.util.List;

import com.training.springboot.dthwebapp.model.Channel;
import com.training.springboot.dthwebapp.model.Customer;
import com.training.springboot.dthwebapp.model.CustomerSubscriptionChannel;
import com.training.springboot.dthwebapp.model.CustomerSubscriptionDetails;

public interface DthService {
	
	public Customer addNewCustomer(Customer customer);
	
	public Channel addNewChannel(Channel channel);
	
	public CustomerSubscriptionChannel subscribeChannelRequest(CustomerSubscriptionChannel subscribeChannelRequest );
	
	public String unSubscribeChannelRequest(Long subscriber_id,int channel_id);
	
	public List viewSubscriptionChannelsRequest(Long subscriber_id);
		

}
