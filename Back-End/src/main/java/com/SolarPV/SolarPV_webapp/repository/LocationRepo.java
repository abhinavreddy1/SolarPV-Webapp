package com.SolarPV.SolarPV_webapp.repository;

import com.SolarPV.SolarPV_webapp.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepo extends JpaRepository<Location,Integer> {
}
