package com.example.stardew_almanac.fish;

import com.example.stardew_almanac.common.Season;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FishRepository extends JpaRepository<Fish, String> {

  List<Fish> findBySeasons(List<Season> seasons);

  List<Fish> findByLocations(List<String> location);

  List<Fish> findByLocationsAndSeasons(List<String> location, List<Season> seasons);
}
