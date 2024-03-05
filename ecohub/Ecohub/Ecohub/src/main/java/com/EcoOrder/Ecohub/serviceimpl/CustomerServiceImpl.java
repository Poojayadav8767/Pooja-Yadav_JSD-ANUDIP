package com.EcoOrder.Ecohub.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.EcoOrder.Ecohub.entity.Customer;
import com.EcoOrder.Ecohub.exception.CustomerIdNotFoundException;
import com.EcoOrder.Ecohub.repository.CustomerRepository;
import com.EcoOrder.Ecohub.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
    CustomerRepository customerRepository;


	@Override
	public Customer registerCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public Customer editCustomer(Customer customer, int cId) {
		Customer existingCustomer = fetchCustomerDetail(cId);

        // Update existing customer fields
        existingCustomer.setCName(customer.getCName());
        existingCustomer.setCSurname(customer.getCSurname());
        existingCustomer.setCEmail(customer.getCEmail());
        existingCustomer.setCPhone(customer.getCPhone());
        existingCustomer.setAddr(customer.getAddr());

        // Additional logic if needed before saving to the repository

        return customerRepository.save(existingCustomer);
    }

	

	@Override
	public void removeCustomer(int cId) {
		Customer customerToDelete = fetchCustomerDetail(cId);
        customerRepository.delete(customerToDelete);
    }

	@Override
	public Customer fetchCustomerDetail(int cId) {
		return customerRepository.findById(cId)
        .orElseThrow(() -> new CustomerIdNotFoundException("Customer not found with id: " + cId));
}

	
}
	