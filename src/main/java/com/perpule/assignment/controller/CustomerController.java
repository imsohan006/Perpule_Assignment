package com.perpule.assignment.controller;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.perpule.assignment.model.Customer;
import com.perpule.assignment.serviceImpl.CustomerServiceImpl;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerServiceImpl customerServiceImpl;
	
	/*
	 * @Method : getCustomer
	 * @return : list of all customer 
	 */
	@GetMapping("/getcustomer")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getCustomer(){
		return customerServiceImpl.getCustomer();
	}
	
	/*
	 * @Method : getCustomerById
	 * @Param : id (customer id)
	 * @Return : customer of given id
	 */
	@GetMapping("/getcustomer/{id}")
	public Optional<Customer> getCustomerById(@PathVariable int id){
		return customerServiceImpl.getCustomerById(id);
	}
	
	/*
	 * @Method : addCustomer
	 * @Param : customer information
	 * @Return : status about requested customer
	 */
	@PostMapping("/addcustomer")
	@Consumes(MediaType.APPLICATION_JSON)
	public String addCustomer(@RequestBody String data) {
		return customerServiceImpl.add(data);
	}
	
}
