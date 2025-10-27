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
  //  public List<Fish> getFishBySeasons(@PathVariable String seasons) {
  public List<Fish> getFishBySeasons(@PathVariable List<Season> seasons) {
    //    List<String> seasonList = List.of(seasons.split(","));
    //    return fishService.getFishBySeason(seasonList);
    return fishService.getFishBySeason(seasons);
  }

  @GetMapping("/{locations}")
  public List<Fish> getFishByLocation(
      @RequestParam(value = "season", required = false) List<Season> seasons,
      //      @RequestParam(value = "season", required = false) String seasons,
      @PathVariable String locations) {
    List<String> locationsList = List.of(locations.split(","));
    if (seasons != null) {
      //      List<String> seasonList = List.of(seasons.split(","));
      return fishService.getFishByLocations(locationsList, seasons);
    } else {
      return fishService.getFishByLocations(locationsList);
    }
  }
}
