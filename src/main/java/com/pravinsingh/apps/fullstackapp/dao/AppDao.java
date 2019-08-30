package com.pravinsingh.apps.fullstackapp.dao;

import com.pravinsingh.apps.fullstackapp.data.ResponseModel;
import com.pravinsingh.apps.fullstackapp.entity.Person;

import java.util.List;
import java.util.Optional;

public interface AppDao {
    Optional<ResponseModel> getData();
    Optional<List<Person>> getDataFromRepository();

    }
