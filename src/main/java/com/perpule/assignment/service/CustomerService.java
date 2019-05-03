package com.perpule.assignment.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.perpule.assignment.model.Customer;

@Repository
public interface CustomerService extends JpaRepository<Customer, Integer>{

}
