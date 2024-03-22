package com.everybuy.routing.controller;

import com.everybuy.buisnesslogic.service.CityService;
import com.everybuy.database.entity.City;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/city")
@RequiredArgsConstructor
public class CityController {
    private final CityService cityService;

    @GetMapping("/get-all")
    public List<City> getAllCountries(){
        return cityService.getAllCities();
    }
}
