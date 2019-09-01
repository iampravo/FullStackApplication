package com.pravinsingh.apps.fullstackapp.service;

import com.pravinsingh.apps.fullstackapp.entity.Car;

import java.util.List;
import java.util.Optional;

public interface AppService {

    Optional<List<Car>> getDataFromRepository();

    }

