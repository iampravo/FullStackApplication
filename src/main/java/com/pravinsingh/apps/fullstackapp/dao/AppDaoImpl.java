package com.pravinsingh.apps.fullstackapp.dao;

import com.google.common.collect.Lists;
import com.pravinsingh.apps.fullstackapp.entity.Car;
import com.pravinsingh.apps.fullstackapp.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Component
public class AppDaoImpl implements AppDao {
    private static int COUNT = 200;

    @Autowired
    private CarRepository carRepository;

    @PostConstruct
    public void init() {
        generateData();
    }

    public Optional<List<Car>> getDataFromRepository() {
        return Optional.of(carRepository.findAll());
    }

   public void generateData() {
        List<Car> carList = Lists.newArrayList();
        for (int i = 2; i < COUNT; i++) {
            carList.add(new Car(i, "BMW" + i, "S-Class" + i, (2 + i)));
        }
       carRepository.saveAll(carList);
    }
}