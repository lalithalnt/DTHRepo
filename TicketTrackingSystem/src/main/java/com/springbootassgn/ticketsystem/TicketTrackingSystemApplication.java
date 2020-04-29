package com.springbootassgn.ticketsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class TicketTrackingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketTrackingSystemApplication.class, args);
	}

}
