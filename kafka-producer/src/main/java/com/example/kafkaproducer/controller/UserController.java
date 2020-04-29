package com.example.kafkaproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafkaproducer.model.User;

@RestController
@RequestMapping("kafka")
public class UserController {
	
	/*
	  @Autowired private KafkaTemplate<String,String> kafkaTemplate;
	 
	
	@GetMapping("/publish/{message}")
	public String postMessage(@PathVariable String message) {
		
		//publish this to a topic 
		kafkaTemplate.send(TOPIC, message);
		
		
		return "Published Successfully";
	} */
	
	/*by default kafka uses string to publish so only we did not do anything for spring message publishing part in above  and now we need to serialize
	  this User object in the type we want to publish 
	
	so here we are going to publish json here so now we need to tell kafka that to publish json message for that 
	we need to do some configuration create one config class */
	
	
	@Autowired
	private KafkaTemplate<String,User> kafkaTemplate;
	
	private static final String TOPIC="Kafka_producer_example";
	
	
	
	@GetMapping("/publish/{name}")
	public String postMessage(@PathVariable String name) {
		
		//publish this to a topic 
		kafkaTemplate.send(TOPIC, new User(name,"Technology Analyst",35000L));
		
		
		return "Published Successfully";
	}

}
