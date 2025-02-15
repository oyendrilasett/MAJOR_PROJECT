package com.example.ecom.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecom.model.Customer;
public interface CustomerDao extends JpaRepository<Customer,Integer>{
	Customer findByEmail(String email);
}