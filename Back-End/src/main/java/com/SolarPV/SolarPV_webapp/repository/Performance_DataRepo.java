package com.SolarPV.SolarPV_webapp.repository;

import com.SolarPV.SolarPV_webapp.model.Performance_Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Performance_DataRepo extends JpaRepository<Performance_Data,Integer> {
}
