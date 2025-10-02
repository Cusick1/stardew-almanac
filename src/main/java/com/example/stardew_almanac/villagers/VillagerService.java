package com.example.stardew_almanac.villagers;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VillagerService {
  private List<Villager> villagers;

  VillagerService() {
    villagers = new ArrayList<>();
    villagers.add(
        new Villager(
            "Abigail",
            "Fall 13",
            true,
            List.of(
                "Amethyst",
                "Banana Pudding",
                "Blackberry Cobbler",
                "Chocolate Cake",
                "Pufferfish",
                "Pumpkin",
                "Spicy Eel")));
    villagers.add(
        new Villager("Alex", "Summer 13", true, List.of("Complete Breakfast", "Salmon Dinner")));
  }

  public Villager getVillagerByName(String name) {
    for (Villager villager : villagers)
      if (villager.getName().equalsIgnoreCase(name)) return villager;
    return null;
  }
}
