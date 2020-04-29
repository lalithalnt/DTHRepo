package com.training.springboot.dthwebapp.controller;

import java.math.BigInteger;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.dthwebapp.exception.InvalidChannelException;
import com.training.springboot.dthwebapp.exception.InvalidSubscriberException;
import com.training.springboot.dthwebapp.model.Channel;
import com.training.springboot.dthwebapp.model.Customer;
import com.training.springboot.dthwebapp.model.CustomerSubscriptionChannel;
import com.training.springboot.dthwebapp.model.CustomerSubscriptionDetails;
import com.training.springboot.dthwebapp.service.DthServiceImpl;


@RestController
@RequestMapping("/dthapi")
public class DthRestController {
	
	@Autowired
	DthServiceImpl dthService;
	
	

		//Rest end point to create new customer  
		@PostMapping("/addNewCustomer")
		public Customer addNewCustomer(@RequestBody Customer customer ) {
			dthService.addNewCustomer(customer);
			return customer;
		
	}
	
		//Rest end point to create new channel 
		@PostMapping("/addNewChannel")
		public Channel addNewChannel(@RequestBody Channel channel) {
			dthService.addNewChannel(channel);
			return channel;
			
		}
		
		//Rest end point to subscribe for new DTH channel 
		@PostMapping("/subscribeChannel")
		public String subscribeChannelRequest(@RequestBody CustomerSubscriptionChannel subscribeChannelRequest ) {
			String controllerResponse="Channel Subscription was successful.......";
			dthService.subscribeChannelRequest(subscribeChannelRequest);
			System.out.println(controllerResponse);
			return controllerResponse;
			
		
		}
		
		//Rest end point to unsubscribe the DTH channel 
		@DeleteMapping("/unsubscribechannel/{subscriber_id}/{channel_id}")
		public String unSubscribeChannelRequest(@PathVariable Long subscriber_id,@PathVariable int channel_id ) throws InvalidSubscriberException,InvalidChannelException {
	
		        if((subscriber_id<=1100123455))
		            throw new InvalidSubscriberException("Could not find the subscriber id entered : "+subscriber_id+".....please enter valid subscriberId to unsubscrie the channel");
		        else if ((channel_id<=230 || channel_id>238))
		        	throw new InvalidChannelException("Could not find the channel id entered :"+channel_id+
		        			".....please enter valid channelID to unsubscribe");
					String controllerResponse="Channel is unsubscribed : "+channel_id;
					System.out.println(controllerResponse);
				 dthService.unSubscribeChannelRequest(subscriber_id,channel_id);
				 return controllerResponse;
				}
				
		
		//Rest end point to view the customer subscription details  
		@GetMapping("/viewsubscription/{subscriber_id}")
		public List<CustomerSubscriptionDetails> viewSubscriptionChannelsRequest(@PathVariable Long subscriber_id) throws InvalidSubscriberException {
			
			 if((subscriber_id<=1100123455))
		            throw new InvalidSubscriberException("Could not find the subscriber id entered : "+subscriber_id+".....please enter valid subscriberId to unsubscrie the channel");
			String controllerResponse="/nYour Subscription details are below:";
			System.out.println(controllerResponse);
			return dthService.viewSubscriptionChannelsRequest(subscriber_id);
			
			
			
		}
		
		
		
}
