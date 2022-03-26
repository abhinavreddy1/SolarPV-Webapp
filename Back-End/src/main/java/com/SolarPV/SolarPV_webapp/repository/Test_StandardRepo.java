package com.SolarPV.SolarPV_webapp.repository;

import com.SolarPV.SolarPV_webapp.model.Test_Standard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Test_StandardRepo extends JpaRepository<Test_Standard,Integer> {
}
