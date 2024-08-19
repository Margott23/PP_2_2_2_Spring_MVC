package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAOImpl;
import web.models.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private final CarDAOImpl carDAO;

    @Autowired
    public CarServiceImpl(CarDAOImpl carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getAllCars() {
        return carDAO.getAllCars();
    }

    @Override
    public List<Car> getCountCar(int count) {
        if (count >= carDAO.getAllCars().size()) {
            return carDAO.getAllCars();
        } else {
            return carDAO.getCountCar(count);
        }
    }

}
