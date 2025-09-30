package com.example.stardew.crops;

import com.example.stardew.common.Season;
import com.example.stardew.villagers.Villager;
import lombok.Data;

import java.util.List;

@Data
public class Crop {

    String name;
    Season season;
    int growthTime;
    int farmingXP;
    com.example.stardew.crops.CropType type;
    int energy;
    int health;
    int price;
    List<Villager> lovedBy;
    List<Villager> dislikedBy;

    public Crop(String name, Season season, int growthTime, int farmingXP, com.example.stardew.crops.CropType type, int energy, int health, int price, List<Villager> lovedBy, List<Villager> dislikedBy) {
        this.name = name;
        this.season = season;
        this.growthTime = growthTime;
        this.farmingXP = farmingXP;
        this.type = type;
        this.energy = energy;
        this.health = health;
        this.price = price;
        this.lovedBy = lovedBy;
        this.dislikedBy = dislikedBy;
    }


}
