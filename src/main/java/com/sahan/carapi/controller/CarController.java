package com.sahan.carapi.controller;

import com.sahan.carapi.dao.FakeCarDao;
import com.sahan.carapi.model.Car;
import com.sahan.carapi.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public Iterable<Car> getAllCars(){
        return carService.getAll();
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable("id") int id){
        return carService.getCarById(id);
    }

    @PostMapping
    public int addCar(@RequestBody Car car){
       return carService.addCar(car);
    }

    @PutMapping
    public int updateCar(@RequestBody Car car){
        return carService.updateCar(car);
    }

}
