package com.example.stardew_almanac.fish;

import com.example.stardew_almanac.common.Season;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FishService {

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

  public Fish getFishByName(String name) {
    for (Fish fish : fishList) {
      if (fish.getName().equalsIgnoreCase(name)) {
        return fish;
      }
    }
    return null; // or throw an exception if preferred
  }
}
