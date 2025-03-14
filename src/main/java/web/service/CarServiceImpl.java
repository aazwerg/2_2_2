package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getSomeCars(List<Car> carsList, int num) {
        return carsList.stream().limit(num).toList();
    }
}
