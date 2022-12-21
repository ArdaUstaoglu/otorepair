package ibmtal.otorepair.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.otorepair.business.service.CarService;
import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.entities.Car;

@RestController
@RequestMapping("/api/cars")
public class CarController {
	private CarService carService;
	@Autowired
	public CarController(CarService carService) {
		super();
		this.carService = carService;
	}
	@PostMapping("/addCar")
	@GetMapping("/getAll")
	public Result<Car> getAll(){
		return this.carService.getAll();

	}
	@PostMapping("/")
	@GetMapping
	public Result<Car> result(@RequestBody CarService carService){
		return this.carService.car(carService);
	}
}