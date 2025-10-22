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

  public List<Fish> getFishBySeason(List<String> seasons) {
    return fishRepository.findBySeasons(seasons);
  }

  public List<Fish> getFishByLocation(List<String> locations) {
    return fishRepository.findByLocations(locations);
  }

  public List<Fish> getFishByLocation(List<String> locations, List<String> seasons) {
    return fishRepository.findByLocationsAndSeasons(locations, seasons);
  }
}
