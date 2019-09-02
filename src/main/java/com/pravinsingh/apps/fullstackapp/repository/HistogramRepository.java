package com.pravinsingh.apps.fullstackapp.repository;

import com.pravinsingh.apps.fullstackapp.entity.Histogram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistogramRepository extends JpaRepository<Histogram,Long> {
    List<Histogram> findAll();

}
