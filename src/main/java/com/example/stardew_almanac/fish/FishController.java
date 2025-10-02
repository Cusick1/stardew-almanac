package com.example.stardew_almanac.fish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FishController {

  private final FishService fishService;

  @Autowired
  public FishController(FishService fishService) {
    this.fishService = fishService;
  }

  public Fish getFishByName(@RequestParam String name) {
    return fishService.getFishByName(name);
  }
}
