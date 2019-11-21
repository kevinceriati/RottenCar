package com.rottencar.restservice.RestApp.dao;

import com.rottencar.restservice.RestApp.model.Car;
import com.rottencar.restservice.RestApp.model.indexes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CarDAO extends DAO<Car> {

    public static List<Car> cars = new ArrayList<>();
    static {
        cars.add(new Car(new String("Multipla"), new String("Fiat"), indexes.getId()));
        cars.add(new Car(new String("Robin"), new String("Reliant"), indexes.getId()));
    }


    @Override
    public Car findById(int id) {
        for (Car car: cars ) {
            if (car.getId() == id) {
                return car;
            }
        }
        return null;
    }

    @Override
    public List<Car> findAll() {
        return cars;
    }

    @Override
    public void save(Car car) {
        car.setId(indexes.getId());
        cars.add(car);
    }

    @Override
    public Car update(Car updateCar) {
        for (Car car : cars) {
            if (car.getId().equals(updateCar.getId())) {
                if (updateCar.getName() != null) {
                    car.setName(updateCar.getName());
                }
                if (updateCar.getBrand() != null) {
                    car.setBrand(updateCar.getBrand());
                }
                return car;
            }
        }
        return null;
    }

    @Override
    public Car delete(int Id) {
        for (Car car : cars) {
            if (car.getId() == Id) {
                cars.remove(car);
                return car;
            }
        }
        return null;
    }

}
