package com.abc;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	Customer findById(long id);
	List<Customer> findByLastname(String lastname);
	List<Customer> findByFirstname(String firstname);
	
}
