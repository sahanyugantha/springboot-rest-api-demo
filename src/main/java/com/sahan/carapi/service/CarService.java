package com.sahan.carapi.service;

import com.sahan.carapi.dao.CarRepository;
import com.sahan.carapi.dao.FakeCarDao;
import com.sahan.carapi.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAll(){
        return carRepository.findAll();
    }

    public Car getCarById(int id){
        //Please do some validations.
        return carRepository.findById(id).get();
    }

    public int addCar(Car car){
        if(car != null){
            carRepository.save(car);
            return 1;
        }

        return -1;
    }

    public int updateCar(Car car){
        if(car != null){
            carRepository.save(car);
            return 1;
        }

        return -1;
    }


}
