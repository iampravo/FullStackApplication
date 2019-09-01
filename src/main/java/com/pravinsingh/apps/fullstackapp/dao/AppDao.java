package com.pravinsingh.apps.fullstackapp.dao;

import com.pravinsingh.apps.fullstackapp.entity.Car;

import java.util.List;
import java.util.Optional;

public interface AppDao {
    Optional<List<Car>> getDataFromRepository();

    }
