package web.mydb;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class MyDB {

    private static int idDB;

    private List<Car> myCars;

    public MyDB(List<Car> myCars) {
        this.myCars = myCars;
    }

    public List<Car> getMyCars() {
        return myCars;
    }

    public void saveCarInDB(Car car) {
        car.setId(++idDB);
        myCars.add(car);
    }

    public Car getMyCarById(int carId) {
        return myCars.get(carId);
    }

    public void removeMyCarById(int carId) {
        myCars.remove(carId);
    }
}
