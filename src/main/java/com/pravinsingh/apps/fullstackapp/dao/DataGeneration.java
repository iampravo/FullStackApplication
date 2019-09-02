package com.pravinsingh.apps.fullstackapp.dao;

import com.google.common.collect.Lists;
import com.pravinsingh.apps.fullstackapp.entity.Car;
import com.pravinsingh.apps.fullstackapp.entity.HeatMap;
import com.pravinsingh.apps.fullstackapp.entity.Histogram;
import com.pravinsingh.apps.fullstackapp.repository.CarRepository;
import com.pravinsingh.apps.fullstackapp.repository.HeatMapRepository;
import com.pravinsingh.apps.fullstackapp.repository.HistogramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class DataGeneration {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private HeatMapRepository heatMapRepository;

    @Autowired
    private HistogramRepository histogramRepository;

    private final String[] row = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

    private String[] columns = {"v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10"};

    public void generateHistogramData() {
        List<Histogram> histograms = Lists.newArrayList();
        Random rand = new Random();
        for (int i = 1; i < 10001; i++) {
            char c = (char) (rand.nextInt(26) + 'a');
            histograms.add(new Histogram(String.valueOf(c), rand.nextInt(1000)));
        }
        histogramRepository.saveAll(histograms);
    }

    public void generateHeatMapData() {
        List<HeatMap> heatMaps = Lists.newArrayList();

        Random rand = new Random();
        Arrays.stream(row).forEach(row -> Arrays.stream(columns).forEach(column -> heatMaps.add(new HeatMap(row, column, rand.nextInt(100)))));
        heatMapRepository.saveAll(heatMaps);
    }

    public void generateCarData() {
        List<Car> carList = Lists.newArrayList();
        for (int i = 2; i < 200; i++) {
            carList.add(new Car(i, "BMW" + i, "S-Class" + i, (2 + i)));
        }
        carRepository.saveAll(carList);
    }
}
