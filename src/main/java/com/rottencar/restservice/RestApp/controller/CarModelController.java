package com.rottencar.restservice.RestApp.controller;

import com.rottencar.restservice.RestApp.dao.CarDAO;
import com.rottencar.restservice.RestApp.model.Car;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarModelController {

     CarDAO dao = new CarDAO();

    @RequestMapping(value="/car", method= RequestMethod.GET)
    @ResponseBody
    public List<Car> carList() {
        return dao.findAll();
    }


    @RequestMapping(value="/car/{id}", method= RequestMethod.GET)
    @ResponseBody
    public Car findById(@PathVariable int id) {
        return dao.findById(id);
    }

    @RequestMapping(value="/car", method= RequestMethod.POST)
    @ResponseBody
    public Car save(@RequestBody Car car){
        dao.save(car);
        return car;
    }

    @RequestMapping(value="/car/{id}", method= RequestMethod.PUT)
    @ResponseBody
    public Car update(@PathVariable int id, @RequestBody Car car) {
        car.setId(id);
        return dao.update(car);
    }

    @RequestMapping(value="/car/{id}", method= RequestMethod.DELETE)
    public void delete (@PathVariable int id) {
        dao.delete(id);
    }
}


