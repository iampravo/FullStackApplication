package com.pravinsingh.apps.fullstackapp.repository;

import com.pravinsingh.apps.fullstackapp.entity.HeatMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HeatMapRepository extends JpaRepository<HeatMap,Long> {
    List<HeatMap> findAll();

}
