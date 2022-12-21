package ibmtal.otorepair.business.manager;

import org.springframework.stereotype.Service;

import ibmtal.otorepair.business.service.CarService;
import ibmtal.otorepair.business.service.ServiceCardService;
import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.entities.ServiceCard;
import ibmtal.otorepair.entities.ServicePart;

@Service
public class ServiceCardManager implements ServiceCardService{

	@Override
	public Result<ServicePart> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result<ServiceCard> car(CarService carService) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.sun.net.httpserver.Authenticator.Result serviceCard(Object serviceCard) {
		// TODO Auto-generated method stub
		return null;
	}

}
