package web.services;

import web.model.Car;

import java.util.List;

public interface CarServices {
    void createCar(Car car);
    List<Car> getCountCars(int count);
}
