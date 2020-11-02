package org.cap.apps.customerjpa.dao;

import org.springframework.stereotype.Repository;

import org.cap.apps.customerjpa.entities.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CustomerDaoImpl implements ICustomerDao {
   @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Customer add(Customer customer) {
        entityManager.persist(customer);
		return customer;
	}
    

   @Override
    public Customer update(Customer customer) {
      
        customer = entityManager.merge(customer);
        return customer;
    }

   @Override
   public Customer findById(long id){

       Customer customer = entityManager.find(Customer.class, id);
       
       return customer;
   }



}
