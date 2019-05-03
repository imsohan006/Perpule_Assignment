package com.perpule.assignment.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perpule.assignment.model.Customer;
import com.perpule.assignment.service.CustomerService;

@Service
public class CustomerServiceImpl {
	
	@Autowired
	private CustomerService customerService;
	
	//logger for CustomerServiceImpl
	Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	/*
	 * @Method : add
	 * @Param : request (new customer json format data)
	 * @return : status about added customer
	 */
	public String add(String request) {
		try {
			logger.info("Extracting request data..");
			JSONObject data = new JSONObject(request);
			Customer customer = new Customer(data.getString("customer_name"), data.getLong("mobile_no"), data.getString("email_id"), data.getString("occupation"), data.getString("address"));
			customerService.save(customer);
			logger.info("Customer Saved Successfully...");
			return "Customer Saved Successfully...";
		}catch (JSONException e) {
			logger.error(e.getMessage());
			return "Invalid Request Data...";
		}catch (Exception e) {
			logger.error(e.getMessage());
			return e.getMessage();
		}
	}
	
	/*
	 * @Method : getCustomerById
	 * @Param : id ( customer id)
	 * @return : customer details
	 */
	public Optional<Customer> getCustomerById(int id) {
		try{
			logger.info("Finding Customer By Id..");
			return customerService.findById(id);
		}catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
	
	/*
	 * @Method : getCustomer
	 * @return : list of all customer
	 */
	public List<Customer> getCustomer() {
		try{
			logger.info("Get All Customers..");
			return customerService.findAll();
		}catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
}
