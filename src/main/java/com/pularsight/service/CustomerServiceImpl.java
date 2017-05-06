package com.pularsight.service;

import java.util.List;

import com.pularsight.model.Customer;
import com.pularsight.repository.CustomerRepository;
import com.pularsight.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.pularsight.service.CustomerService#findAll()
	 */
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
