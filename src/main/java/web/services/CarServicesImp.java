package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServicesImp implements CarServices{

    private CarDao carDao;

    @Autowired
    public CarServicesImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public void createCar(Car car) {
        carDao.saveCar(car);
    }

    @Override
    public List<Car> getCountCars(int count) {
        if ((count < 5) && (count > 0)) {
            return carDao.carList().stream().limit(count).toList();
        } else {
            return carDao.carList();
        }
    }
}
