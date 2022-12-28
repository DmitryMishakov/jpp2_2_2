package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;
import web.mydb.MyDB;

import java.util.List;

@Component
public class CarDaoImp implements CarDao{

    private MyDB allCars;

    @Autowired
    public CarDaoImp(MyDB allCars) {
        this.allCars = allCars;
    }

    @Override
    public void saveCar(Car car) {
        allCars.getMyCars().add(car);
    }

    @Override
    public List<Car> carList() {
        return allCars.getMyCars();
    }

    @Override
    public Car carById(int carId) {
        return allCars.getMyCars().get(carId);
    }

    @Override
    public void deleteCarById(int carId) {
        allCars.getMyCars().remove(carId);
    }
}
