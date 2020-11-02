
package org.cap.apps.customerjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.cap.apps.customerjpa.dao.*;
import org.cap.apps.customerjpa.entities.*;
import org.cap.apps.customerjpa.util.*;

@Transactional
@Service
public class CustomerServiceImpl implements ICustomerService {
  
    @Autowired
    private ICustomerDao dao;


    @Override
    public Customer register(Customer customer) {
        ValidationUtil.checkIdNotNull(customer);
        customer = dao.add(customer);
        return customer;
    }


	@Override
	public Customer updateName(long id, String name) {
		ValidationUtil.checkName(name);
		Customer customer=dao.findById(id);
		customer.setName(name);
		customer=dao.update(customer);
        return customer;
	}



}
