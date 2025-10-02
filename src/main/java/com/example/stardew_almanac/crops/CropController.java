package com.example.stardew_almanac.crops;

import com.example.stardew_almanac.common.Season;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CropController {

  private final CropService cropService;

  @Autowired
  public CropController(CropService cropService) {
    this.cropService = cropService;
  }

  @GetMapping("/crop")
  public Crop getCropByName(@RequestParam String name) {
    return cropService.getCropsByName(name);
  }
}
