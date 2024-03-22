package com.everybuy.routing.controller;

import com.everybuy.buisnesslogic.service.CountryService;
import com.everybuy.database.entity.Country;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country")
@RequiredArgsConstructor
public class CountryController {
    private final CountryService countryService;

    @GetMapping("/get-all")
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }
}
