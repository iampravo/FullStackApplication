package com.pravinsingh.apps.fullstackapp.controller;

import com.pravinsingh.apps.fullstackapp.data.ResponseModel;
import com.pravinsingh.apps.fullstackapp.entity.Car;
import com.pravinsingh.apps.fullstackapp.exception.FullStackAppException;
import com.pravinsingh.apps.fullstackapp.service.AppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/fullstackapp")
public class AppController {
    Logger logger = LoggerFactory.getLogger(AppController.class);

    @Autowired
    private AppService appService;

    @RequestMapping(value = "/data")
    public ResponseEntity<ResponseModel> getData() {
        logger.info("getData invoked");
        try {
            List<Car> responseModel = appService.getDataFromRepository().get();
            if (responseModel.isEmpty()) {
                logger.warn("Data is not available");
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            logger.info("getData successfully completed.");
            return new ResponseEntity(responseModel, HttpStatus.OK);
        } catch (FullStackAppException e) {
            logger.error(e.getLocalizedMessage());
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
