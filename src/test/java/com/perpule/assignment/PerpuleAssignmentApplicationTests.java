package com.perpule.assignment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.perpule.assignment.serviceImpl.CustomerServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PerpuleAssignmentApplicationTests {

	@Autowired
	private CustomerServiceImpl customerServiceImpl;
	
	@Test
	public void contextLoads() {
	}

	/*
	 * @Test Method : add new customer
	*/
	
	@Test
	public void addCustomer() {
		
		try {
			JSONObject requestdata = new JSONObject();
			requestdata.put("customer_name", "Sohan Yadav");
			requestdata.put("mobile_no", 865942368);
			requestdata.put("email_id", "sam@gmail.com");
			requestdata.put("occupation", "SE");
			requestdata.put("address", "131, HP road, shyamnager");
			assertEquals("Customer Saved Successfully...", customerServiceImpl.add(requestdata.toString()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getCustomer() {
		assertNotEquals(null, customerServiceImpl.getCustomer());
	}
	
	@Test
	public void getCustomerById() {
		assertNotEquals(null, customerServiceImpl.getCustomerById(1));
	}

}
