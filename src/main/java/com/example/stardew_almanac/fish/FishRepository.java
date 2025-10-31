package com.example.stardew_almanac.fish;

import com.example.stardew_almanac.common.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FishRepository extends JpaRepository<Fish, String> {

  @Query(value = "SELECT f FROM fish WHERE f.seasons LIKE '%:season%'")
  List<Fish> findBySeason(Season season);

  List<Fish> findByLocations(String location);

  List<Fish> findByLocationAndSeason(String location, Season season);
}
