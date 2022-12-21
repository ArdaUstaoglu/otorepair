package ibmtal.otorepair.business.service;

import ibmtal.otorepair.business.manager.CustomerManager;
import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.entities.Customer;

public interface CustomerService {
	Result<Customer> getAll();
	Result<Customer> car(CustomerService carService);
	Result<CustomerManager> Customer(CustomerService customerService);
}
