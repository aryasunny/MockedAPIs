package com.wag.collector.client;

import java.util.List;

public abstract interface CustomerRepository{

	List<Customer> findAll();

}