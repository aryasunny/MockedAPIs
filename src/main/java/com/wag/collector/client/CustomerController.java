package com.wag.collector.client;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = { "*" }, methods = { org.springframework.web.bind.annotation.RequestMethod.GET,
		org.springframework.web.bind.annotation.RequestMethod.PUT,
		org.springframework.web.bind.annotation.RequestMethod.POST })

@RequestMapping({ "/customerDetails" })
final class CustomerController {
	private final CustomerService service;

	@Autowired
	CustomerController(CustomerService service) {
		this.service = service;
	}

	@RequestMapping(method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	List<Customer> findAll() {
		return this.service.findAll();
	}
}