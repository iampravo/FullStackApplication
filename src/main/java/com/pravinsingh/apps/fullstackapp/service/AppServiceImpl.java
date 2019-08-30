package com.pravinsingh.apps.fullstackapp.service;

import com.pravinsingh.apps.fullstackapp.dao.AppDao;
import com.pravinsingh.apps.fullstackapp.data.ResponseModel;
import com.pravinsingh.apps.fullstackapp.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppServiceImpl implements AppService {

    @Autowired
    private AppDao appDao;

    @Override
    public Optional<List<Person>> getDataFromRepository() {
        return appDao.getDataFromRepository();

       // return Optional.empty();
    }

    @Override
    public Optional<ResponseModel> getData() {
        return appDao.getData();

        // return Optional.empty();
    }
}
