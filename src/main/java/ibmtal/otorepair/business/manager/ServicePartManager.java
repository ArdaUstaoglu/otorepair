package ibmtal.otorepair.business.manager;

import org.springframework.stereotype.Service;

import ibmtal.otorepair.business.service.CarService;
import ibmtal.otorepair.business.service.ServicePartService;
import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.entities.ServicePart;

@Service
public class ServicePartManager implements ServicePartService{

	@Override
	public Result<ServicePart> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<ServicePart> car(CarService carService) {
		// TODO Auto-generated method stub
		return null;
	}

}
