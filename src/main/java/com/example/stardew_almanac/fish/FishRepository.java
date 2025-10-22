package com.example.stardew_almanac.fish;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FishRepository extends JpaRepository<Fish, String> {

  List<Fish> findBySeasons(List<String> seasons);

  List<Fish> findByLocations(List<String> location);

  List<Fish> findByLocationsAndSeasons(List<String> location, List<String> seasons);
}
