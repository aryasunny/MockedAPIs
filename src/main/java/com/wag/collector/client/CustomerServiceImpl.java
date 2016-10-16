package com.wag.collector.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

@Service
final class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> findAll() {

		List<Customer> customer_Details = this.customerRepository.findAll();

		return customer_Details;
	}

}
