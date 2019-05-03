package com.perpule.assignment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String customer_name;
	private long mobile_no;
	private String email_id;
	private String occupation;
	private String address;
	
	public Customer() {}
	
	public Customer(String customer_name, long mobile_no, String email_id, String occupation, String address) {
		super();
		this.customer_name = customer_name;
		this.mobile_no = mobile_no;
		this.email_id = email_id;
		this.occupation = occupation;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public long getMobile_no() {
		return mobile_no;
	}
	public String getEmail_id() {
		return email_id;
	}
	public String getOccupation() {
		return occupation;
	}
	public String getAddress() {
		return address;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
