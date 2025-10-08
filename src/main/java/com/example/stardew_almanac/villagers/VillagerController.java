package com.example.stardew_almanac.villagers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VillagerController {

  private final VillagerService villagerService;

  @Autowired
  VillagerController(VillagerService villagerService) {
    this.villagerService = villagerService;
  }

  @GetMapping("/villagers")
  public List<Villager> getVillagers() {
    return villagerService.getVillagers();
  }

  @GetMapping("/villager/{name}")
  public Villager getVillagerByName(@PathVariable String name) {
    return villagerService.getVillagerByName(name);
  }
}
