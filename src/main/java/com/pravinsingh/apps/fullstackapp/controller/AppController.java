package com.pravinsingh.apps.fullstackapp.controller;

import com.pravinsingh.apps.fullstackapp.data.ResponseModel;
import com.pravinsingh.apps.fullstackapp.entity.Person;
import com.pravinsingh.apps.fullstackapp.model.Employee;
import com.pravinsingh.apps.fullstackapp.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/fullstackapp")
public class AppController {

    @Autowired
    private AppService appService;

    @RequestMapping(value = "/welcome")
    public String welcome() {
        return "welcome to app";
    }

    @RequestMapping(value = "/data")
    public ResponseEntity<ResponseModel> getData() {
        List<Person> responseModel = appService.getDataFromRepository().get();
        return new ResponseEntity(responseModel, HttpStatus.OK);
    }

}
