package com.pravinsingh.apps.fullstackapp.service;

import com.pravinsingh.apps.fullstackapp.model.CarDTO;
import com.pravinsingh.apps.fullstackapp.model.HeatMapDTO;
import com.pravinsingh.apps.fullstackapp.model.HistogramDTO;

import java.util.List;
import java.util.Optional;

public interface AppService {

    Optional<List<CarDTO>> getCarData();

    Optional<List<HistogramDTO>> getHistogramData();

    Optional<List<HeatMapDTO>> getHeatMapData();
}

