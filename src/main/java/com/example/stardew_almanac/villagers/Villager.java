package com.example.stardew_almanac.villagers;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Villager {
  private String name;
  private String birthday;
  private boolean marriageable;
  private List<String> lovedGifts;

  public Villager(String name, String birthday, boolean marriageable, List<String> lovedGifts) {
    this.name = name;
    this.birthday = birthday;
    this.marriageable = marriageable;
    this.lovedGifts = lovedGifts;
  }
}
