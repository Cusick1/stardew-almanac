package com.example.stardew_almanac.villagers;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "villagers")
public class Villager {
  @Id private String name;
  private String birthday;
  private boolean marriageable;

  //  private List<String> lovedGifts;

  //  public Villager(String name, String birthday, boolean marriageable, List<String> lovedGifts) {
  public Villager(String name, String birthday, boolean marriageable) {
    this.name = name;
    this.birthday = birthday;
    this.marriageable = marriageable;
    //    this.lovedGifts = lovedGifts;
  }

  public Villager() {}
}
