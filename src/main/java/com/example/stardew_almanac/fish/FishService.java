package com.example.stardew_almanac.fish;

import com.example.stardew_almanac.common.Season;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FishService {

  @Autowired private FishRepository fishRepository;
  private final List<Fish> fishList;

  public FishService() {
    fishList = new ArrayList<>();
    fishList.add(
        new Fish(
            "Bream",
            "A fairly common river fish that becomes active at night.",
            "6 PM - 2 AM",
            "Any",
            25,
            75,
            List.of(Season.ALL),
            List.of("Town River"),
            List.of("Fish Taco", "Sashimi")));
  }

  public List<Fish> getFish() {
    return fishRepository.findAll();
  }

  public Fish getFishByName(String name) {
    return fishRepository.findById(name).orElse(null);
  }

  public List<Fish> getFishBySeason(Season season) {
    return fishRepository.findBySeason(season);
  }

  public List<Fish> getFishByLocations(String location) {
    return fishRepository.findByLocations(location);
  }

  public List<Fish> getFishByLocations(String location, Season season) {
    return fishRepository.findByLocationAndSeason(location, season);
  }
}
