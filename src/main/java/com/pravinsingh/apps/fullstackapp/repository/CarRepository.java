package com.pravinsingh.apps.fullstackapp.repository;

import com.pravinsingh.apps.fullstackapp.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {
    List<Car> findAll();

}
