package com.wag.collector.client;

import java.util.List;

public abstract interface CustomerService {
	public abstract List<Customer> findAll();
}