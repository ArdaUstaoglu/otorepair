package ibmtal.otorepair.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.otorepair.business.manager.CustomerManager;
import ibmtal.otorepair.business.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController<Customer> {
	private CustomerService customerService;
	@Autowired
	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	@PostMapping("/addCustomer")
	@GetMapping("/getAll")
	public ibmtal.otorepair.core.result.Result<ibmtal.otorepair.entities.Customer> getAll(){
		return this.customerService.getAll();
	}
	@PostMapping("/")
	@GetMapping
	public ibmtal.otorepair.core.result.Result<CustomerManager> result(@RequestBody CustomerController<?> customerController){
		return this.customerService.Customer(customerService);
		
	}
}