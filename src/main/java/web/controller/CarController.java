package web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.services.CarServices;

@Controller
public class CarController {

    private final CarServices carServices;

    private static Logger logger = LoggerFactory.getLogger(CarController.class);



    @Autowired
    public CarController(CarServices carServices) {
        this.carServices = carServices;
        this.carServices.createCar(new Car("Lada", 123321123, "Dima"));
        this.carServices.createCar(new Car("Kamaz", 102394767, "Ivan"));
        this.carServices.createCar(new Car("Volga", 56280222, "Petr"));
        this.carServices.createCar(new Car("Tank", 1928746, "Serj"));
        this.carServices.createCar(new Car("Tesla", 1013124, "Vasya"));
    }

    @GetMapping("/cars")
    public String  helloCars(@RequestParam(value = "count", required = false) Integer count,
                             Model model) {
        carServices.getCountCars(count).forEach(x -> logger.info(x.toString()));
        return "cars";
    }
}
