package com.pravinsingh.apps.fullstackapp.service;

import com.pravinsingh.apps.fullstackapp.data.ResponseModel;
import com.pravinsingh.apps.fullstackapp.entity.Person;

import java.util.List;
import java.util.Optional;

public interface AppService {

    Optional<List<Person>> getDataFromRepository();

    Optional<ResponseModel> getData();

    }

