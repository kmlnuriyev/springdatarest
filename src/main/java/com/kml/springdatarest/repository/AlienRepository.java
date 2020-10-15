package com.kml.springdatarest.repository;

import com.kml.springdatarest.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlienRepository extends JpaRepository<Alien, Integer> {
}
