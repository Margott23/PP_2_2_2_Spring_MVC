package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.List;

@Component
public class CarDAOImpl implements CarDAO {

    final List<Car> cars = List.of(
            new Car("AUDI", "Black", 2020),
            new Car("BMW", "Blue", 2021),
            new Car("Mercedes", "White", 2022),
            new Car("VW", "Grey", 2019),
            new Car("MiniCooper", "Red", 2023)
    );

    public List<Car> getAllCars() {
        return this.cars;
    }

    public List<Car> getCountCar(int count) {
        return this.cars.stream()
                .limit(count)
                .toList();
    }

}


