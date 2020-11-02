package org.cap.apps.customerjpa.dao;

import org.cap.apps.customerjpa.entities.Customer;

public interface ICustomerDao {
	
    Customer add(Customer customer);
	
	Customer update(Customer customer);

	Customer findById(long id);
}
