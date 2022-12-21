package ibmtal.otorepair.business.service;

import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.entities.ServiceCard;
import ibmtal.otorepair.entities.ServicePart;

public interface ServiceCardService {
	Result<ServicePart> getAll();
	Result<ServiceCard> car(CarService carService);
	com.sun.net.httpserver.Authenticator.Result serviceCard(Object serviceCard);
}
