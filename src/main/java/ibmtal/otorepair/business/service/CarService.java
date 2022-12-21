package ibmtal.otorepair.business.service;

import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.entities.Car;

public interface CarService {
	Result<Car> getAll();
	Result<Car> updateCar(CarService carService);
	Result<Car> car(CarService carService);
	Result<Car> car(Car car);
	Result<Car> carService(CarService carService);
}
