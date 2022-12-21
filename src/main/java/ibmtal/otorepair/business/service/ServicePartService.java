package ibmtal.otorepair.business.service;

import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.entities.ServicePart;

public interface ServicePartService {
	Result<ServicePart> getAll();
	Result<ServicePart> car(CarService carService);
}
