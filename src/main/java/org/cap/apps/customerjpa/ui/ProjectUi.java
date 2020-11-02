
package org.cap.apps.customerjpa.ui;
import org.cap.apps.customerjpa.entities.Customer;
import org.cap.apps.customerjpa.exceptions.InvalidIdException;
import org.cap.apps.customerjpa.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProjectUi {
	@Autowired
	private ICustomerService service ;

	public void runUi() {
		try {

			Customer customer = add("panda");
			long id1 = customer.getId();
			Customer customer2 = add("Sona");
			long id2 = customer2.getId();
			Customer customer3 = add("rashu");
			long id3 = customer3.getId();
			customer2=updateName(2, "papi");
			
		}
	
		catch (InvalidIdException e){
			System.out.println(e.getMessage());
		}

	}


	public Customer add(String name) {
		Customer customer = new Customer(name);
		customer = service.register(customer);
		System.out.println("Customer added with details, id=" + customer.getId() + " name=" + customer.getName());
		return customer;
	}
	public Customer updateName(long id,String name) {
		Customer customer = service.updateName(id,name);
		System.out.println("Customer details updated, id=" + customer.getId() + " name=" + customer.getName());
		return customer;
	}
}
