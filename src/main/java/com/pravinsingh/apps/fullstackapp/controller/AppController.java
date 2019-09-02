package com.pravinsingh.apps.fullstackapp.controller;

import com.google.gson.Gson;
import com.pravinsingh.apps.fullstackapp.exception.FullStackAppException;
import com.pravinsingh.apps.fullstackapp.model.CarDTO;
import com.pravinsingh.apps.fullstackapp.model.HeatMapDTO;
import com.pravinsingh.apps.fullstackapp.model.HistogramDTO;
import com.pravinsingh.apps.fullstackapp.service.AppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/fullstackapp")
public class AppController {
    private final Logger logger = LoggerFactory.getLogger(AppController.class);

    @Autowired
    private AppService appService;

    @RequestMapping(value = "/car")
    public ResponseEntity getCarData() {
        logger.info("getData invoked");
        try {
            Optional<List<CarDTO>> responseModel = appService.getCarData();
            if (!responseModel.isPresent() || responseModel.get().isEmpty()) {
                logger.warn("Data is not available");
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            logger.info("getData successfully completed.");
            return new ResponseEntity(responseModel.get(), HttpStatus.OK);
        } catch (FullStackAppException e) {
            logger.error(e.getLocalizedMessage());
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping("/histogram")
    public ResponseEntity getHistogramData() {

        logger.info("getHistogramData invoked");
        try {

            Gson gson = new Gson();
            Optional<List<HistogramDTO>> responseModel = appService.getHistogramData();
            if (!responseModel.isPresent() || responseModel.get().isEmpty()) {
                logger.warn("Data is not available");
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            logger.info("getHistogramData successfully completed.");
            return new ResponseEntity(gson.toJson(responseModel.get()), HttpStatus.OK);
        } catch (FullStackAppException e) {
            logger.error(e.getLocalizedMessage());
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

    @RequestMapping("/heatmap")
    public ResponseEntity getHeatMapData() {
        logger.info("getHeatMapData invoked");
        try {
            Gson gson = new Gson();
            Optional<List<HeatMapDTO>> responseModel = appService.getHeatMapData();
            if (!responseModel.isPresent() || responseModel.get().isEmpty()) {
                logger.warn("Data is not available");
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            logger.info("getHeatMapData successfully completed.");
            return new ResponseEntity(gson.toJson(responseModel.get()), HttpStatus.OK);
        } catch (FullStackAppException e) {
            logger.error(e.getLocalizedMessage());
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
