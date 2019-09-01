package com.pravinsingh.apps.fullstackapp.dao;

import com.google.common.collect.Lists;
import com.pravinsingh.apps.fullstackapp.entity.Car;
import com.pravinsingh.apps.fullstackapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Component
public class AppDaoImpl implements AppDao {
    private static int COUNT = 200;

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostConstruct
    public void init() {
        generateData();
    }

    public Optional<List<Car>> getDataFromRepository() {
        return Optional.of(employeeRepository.findAll());
    }

    public void generateData() {
        List<Car> carList = Lists.newArrayList();
        for (int i = 0; i < COUNT; i++) {
            carList.add(new Car(i, "Pravin" + i, "Singh" + i, (20 + i)));
        }
       employeeRepository.saveAll(carList);
    }
}