package com.SolarPV.SolarPV_webapp.repository;

import com.SolarPV.SolarPV_webapp.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<Client,Integer> {
}
