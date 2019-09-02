package com.pravinsingh.apps.fullstackapp.dao;

import com.pravinsingh.apps.fullstackapp.entity.Car;
import com.pravinsingh.apps.fullstackapp.entity.HeatMap;
import com.pravinsingh.apps.fullstackapp.entity.Histogram;
import com.pravinsingh.apps.fullstackapp.exception.FullStackAppException;
import com.pravinsingh.apps.fullstackapp.model.CarDTO;
import com.pravinsingh.apps.fullstackapp.model.HeatMapDTO;
import com.pravinsingh.apps.fullstackapp.model.HistogramDTO;
import com.pravinsingh.apps.fullstackapp.repository.CarRepository;
import com.pravinsingh.apps.fullstackapp.repository.HeatMapRepository;
import com.pravinsingh.apps.fullstackapp.repository.HistogramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class AppDaoImpl implements AppDao {
    @Autowired
    private CarRepository carRepository;

    @Autowired
    private HeatMapRepository heatMapRepository;

    @Autowired
    private HistogramRepository histogramRepository;

    @Autowired
    private
    DataGeneration dataGeneration;

    @PostConstruct
    public void init() {
        dataGeneration.generateCarData();
        dataGeneration.generateHeatMapData();
        dataGeneration.generateHistogramData();

    }

    public Optional<List<CarDTO>> getCarData() {
        List<Car> result = carRepository.findAll();
        if (result.isEmpty())
            throw new FullStackAppException("Car Data not found");
        return Optional.of(result
                .stream()
                .map(res -> new CarDTO(res.getSerialId(), res.getBrandName(), res.getModelName(), res.getLifeTime()))
                .collect(Collectors.toList()));
    }

    @Override
    public Optional<List<HistogramDTO>> getHistogramData() {
        List<Histogram> result = histogramRepository.findAll();
        if (result.isEmpty())
            throw new FullStackAppException("Historical Data not found");
        return Optional.of(result
                .stream()
                .map(res -> new HistogramDTO(res.getName(), res.getValue()))
                .collect(Collectors.toList()));
    }

    @Override
    public Optional<List<HeatMapDTO>> getHeatMapData() {
        List<HeatMap> result = heatMapRepository.findAll();
        if (result.isEmpty())
            throw new FullStackAppException("Heatmap Data not found");
        return Optional.of(result
                .stream()
                .map(res -> new HeatMapDTO(res.getGroupId(), res.getVariable(), res.getValue()))
                .collect(Collectors.toList()));

    }
}