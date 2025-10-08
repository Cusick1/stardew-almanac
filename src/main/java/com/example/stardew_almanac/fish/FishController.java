package com.example.stardew_almanac.fish;

import com.example.stardew_almanac.common.Season;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

  @GetMapping("/${name}")
  public Fish getFishByName(@RequestParam String name) {
    return fishService.getFishByName(name);
  }

  @GetMapping("/${season}")
  public List<Fish> getFishBySeason(@RequestParam Season season) {
    return fishService.getFishBySeason(season);
  }
}
