package com.pravinsingh.apps.fullstackapp.service;

import com.pravinsingh.apps.fullstackapp.dao.AppDao;
import com.pravinsingh.apps.fullstackapp.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppServiceImpl implements AppService {

    @Autowired
    private AppDao appDao;

    @Override
    public Optional<List<Car>> getDataFromRepository() {
        return appDao.getDataFromRepository();
    }
}
