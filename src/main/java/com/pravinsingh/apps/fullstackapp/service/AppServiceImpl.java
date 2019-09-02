package com.pravinsingh.apps.fullstackapp.service;

import com.pravinsingh.apps.fullstackapp.dao.AppDao;
import com.pravinsingh.apps.fullstackapp.model.CarDTO;
import com.pravinsingh.apps.fullstackapp.model.HeatMapDTO;
import com.pravinsingh.apps.fullstackapp.model.HistogramDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppServiceImpl implements AppService {

    @Autowired
    private AppDao appDao;

    @Override
    public Optional<List<CarDTO>> getCarData() {
        return appDao.getCarData();
    }

    @Override
    public Optional<List<HistogramDTO>> getHistogramData() {
       return  appDao.getHistogramData();
    }

    @Override
    public Optional<List<HeatMapDTO>> getHeatMapData() {
        return  appDao.getHeatMapData();
    }
}
