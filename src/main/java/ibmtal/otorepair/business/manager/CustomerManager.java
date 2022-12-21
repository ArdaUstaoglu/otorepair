package ibmtal.otorepair.business.manager;

import org.springframework.stereotype.Service;

import ibmtal.otorepair.business.service.CustomerService;
import ibmtal.otorepair.core.result.Result;

@Service
public class CustomerManager implements CustomerService{

	@Override
	public Result<ibmtal.otorepair.entities.Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<ibmtal.otorepair.entities.Customer> car(CustomerService carService) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<CustomerManager> Customer(CustomerService customerService) {
		// TODO Auto-generated method stub
		return null;
	}

}
