package com.wag.collector.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CustomerRepositoryImpl implements CustomerRepository{

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		List<Customer> customer_details = new ArrayList<>();
		
		for(int i=0;i<5;i++){
			Customer customer = new Customer();
			customer.setCustomerFirstName("CustomerFirstName"+i);
			customer.setCustomerLastName("CustomerLastName"+i);
			customer.setCustomerId(i);
			customer.setCustomerAge(25);
			customer.setCustomerAddress("Porirua"+i);
			customer_details.add(customer);
		}
		return customer_details;
	}

}
