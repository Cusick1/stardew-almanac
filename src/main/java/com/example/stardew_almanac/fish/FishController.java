package com.example.stardew_almanac.fish;

import com.example.stardew_almanac.common.Season;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fish")
public class FishController {

  private final FishService fishService;

  @Autowired
  public FishController(FishService fishService) {
    this.fishService = fishService;
  }

  @GetMapping
  public List<Fish> getFish() {
    return fishService.getFish();
  }

  @GetMapping("/{name}")
  public Fish getFishByName(@PathVariable String name) {
    return fishService.getFishByName(name);
  }

  @GetMapping("/{seasons}")
  public List<Fish> getFishBySeasons(@PathVariable String seasons) {
    List<String> seasonList = List.of(seasons.split(","));
    return fishService.getFishBySeason(seasonList);
  }

  @GetMapping("/{locations}")
  public List<Fish> getFishByLocation(
      @RequestParam(value = "season", required = false) String seasons,
      @PathVariable String locations) {
    List<String> locationsList = List.of(locations.split(","));
    if (seasons != null) {
      List<String> seasonList = List.of(seasons.split(","));
      return fishService.getFishByLocation(locationsList, seasonList);
    } else {
      return fishService.getFishByLocation(locationsList);
    }
  }
}
