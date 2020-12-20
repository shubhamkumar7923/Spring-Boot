package com.abc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaApplication {
	private static final Logger log = LoggerFactory.getLogger(SpringJpaApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args)->{
			repository.save(new Customer("Anand","Kumar"));
			repository.save(new Customer("Kishore","Kumar"));
			repository.save(new Customer("Shubham","Kumar"));
			repository.save(new Customer("Pankaj","Kumar"));
			
			log.info("Customer found with findAll():");
			log.info("---------------------------------");
			for(Customer customer:repository.findAll()) {
				log.info(customer.toString());
			}
			Customer customer = repository.findById(2);
			log.info("Customer found with id 2: ");
			log.info("-----------------------------------");
			log.info(customer.toString());
			log.info("Customer found with last name kumar");
			log.info("------------------------------------");
			for(Customer customer2: repository.findByLastname("Kumar")) {
				log.info(customer2.toString());
			}
			log.info("Customer found with first name shubham");
			log.info("------------------------------------");
			for(Customer customer3:repository.findByFirstname("Shubham")) {
				log.info(customer3.toString());
			}
		};
	}
}
