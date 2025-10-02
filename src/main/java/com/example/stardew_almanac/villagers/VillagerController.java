package com.example.stardew_almanac.villagers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VillagerController {

  private final VillagerService villagerService;

  @Autowired
  VillagerController(VillagerService villagerService) {
    this.villagerService = villagerService;
  }

  @GetMapping("/villagers")
  public Villager getVillagerByName(@RequestParam String name) {
    return villagerService.getVillagerByName(name);
  }
}
