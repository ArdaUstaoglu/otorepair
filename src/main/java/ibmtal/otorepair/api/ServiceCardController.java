package ibmtal.otorepair.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.net.httpserver.Authenticator.Result;

import ibmtal.otorepair.business.service.ServiceCardService;
import ibmtal.otorepair.entities.ServicePart;

@RestController
@RequestMapping("/api/serviceCards")
public class ServiceCardController {
	private ServiceCardService serviceCardService;
	@Autowired
	public ServiceCardController(ServiceCardService serviceCardService) {
		super();
		this.serviceCardService = serviceCardService;
	}
	@PostMapping("/addServiceCard")
	@GetMapping("/getAll")
	public ibmtal.otorepair.core.result.Result<ServicePart> getAll(){
		return this.serviceCardService.getAll();
	}
	@PostMapping("/")
	@GetMapping
	public Result result(@RequestBody ServiceCardController serviceCardController){
		Object serviceCard = null;
		return this.serviceCardService.serviceCard(serviceCard);
		
	}
}