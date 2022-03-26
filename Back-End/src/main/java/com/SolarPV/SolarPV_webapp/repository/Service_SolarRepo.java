package com.SolarPV.SolarPV_webapp.repository;

import com.SolarPV.SolarPV_webapp.model.Service_Solar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Service_SolarRepo extends JpaRepository<Service_Solar,Integer> {
}
