package com.sahan.carapi.dao;

import com.sahan.carapi.model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Car,Integer> {
}
