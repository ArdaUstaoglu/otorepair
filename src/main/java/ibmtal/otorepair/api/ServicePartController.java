package ibmtal.otorepair.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.otorepair.business.service.ServiceCardService;
import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.entities.ServicePart;

@RestController
@RequestMapping("/api/serviceParts")
public class ServicePartController {
	private ibmtal.otorepair.business.service.ServicePartService ServicePartService;
	private ServiceCardService servicePartService;
	@Autowired
	public ServicePartController(ServiceCardService servicePartService) {
		super();
		this.servicePartService = servicePartService;
	}
	@PostMapping("/addServicePart")
	@GetMapping("/getAll")
	public Result<ServicePart> getAll() {
		return this.servicePartService.getAll();
	}
	@PostMapping("/")
	@GetMapping
	public <ServicePartService> Result<ServicePart> result(@RequestBody ServicePartService servicePartService){
		return ((ServicePart) this.ServicePartService).servicePart((ibmtal.otorepair.business.service.ServicePartService) servicePartService);
	}
}