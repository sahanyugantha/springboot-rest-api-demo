package com.sahan.carapi.dao;

import com.sahan.carapi.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FakeCarDao {

    public List<Car> getAllCars(){
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1, "Axio", "Toyota"));
        carList.add(new Car(2, "WagonR", "Suzuki"));
        carList.add(new Car(3, "Premio", "Toyota"));
        carList.add(new Car(4, "CH-R", "Toyota"));
        carList.add(new Car(5, "Sunny", "Nissan"));

        return carList;
    }

}
