package com.example.kafkaconsumer.listener;



import org.springframework.kafka.annotation.KafkaListener;

import org.springframework.stereotype.Service;

import com.example.kafkaconsumer.model.User;

@Service
public class KafkaConsumerSample {
	

	
	@KafkaListener(topics = "Kafka_producer_example",groupId = "group_id")
	public void consume(String message)
	{
		System.out.println("Consumed message : "+message);
	}
	
	//as this is new topic "Kafka_producer_example_json" so we have to create this topic first
	@KafkaListener(topics = "Kafka_producer_example_jsonfile1",groupId = "group_jsonfile",
			containerFactory = "userkafkaListenerContainerFactory")
	public void consumeJson(User user)
	{
		System.out.println("Consumed JSON message " +user);
	}

}
