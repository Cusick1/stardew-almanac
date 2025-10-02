package com.example.stardew_almanac.villagers;

import com.example.stardew_almanac.common.Feeling;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Villager {
    private String name;
    private String birthday;
    private boolean marriageable;
    private List<String> lovedGifts;
    private Map<String, Feeling> allGifts;

    public Villager(String name, String birthday, boolean marriageable, List<String> lovedGifts, Map<String, Feeling> allGifts) {
        this.name = name;
        this.birthday = birthday;
        this.marriageable = marriageable;
        this.lovedGifts = lovedGifts;
        this.allGifts = allGifts;
    }

}


