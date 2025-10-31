package com.example.stardew_almanac.fish;

import com.example.stardew_almanac.common.Season;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FishService {

    @Autowired
    private FishRepository fishRepository;

    public FishService() {
    }

    public List<Fish> getFish() {
        return fishRepository.findAll();
    }

    public Fish getFishByName(String name) {
        return fishRepository.findById(name).orElse(null);
    }

    public List<Fish> getFishBySeason(Season season) {
        return fishRepository.findBySeason(season.toString());
    }

    public List<Fish> getFishByLocations(String location) {
        return fishRepository.findByLocations(location);
    }

    public List<Fish> getFishByLocations(String location, Season season) {
        return fishRepository.findByLocationAndSeason(location, season);
    }
}
