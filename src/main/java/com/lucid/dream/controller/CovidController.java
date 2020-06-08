package com.lucid.dream.controller;


import com.lucid.dream.Service.covid.CovidServiceImpl;
import com.lucid.dream.domain.payload.request.CovidRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CovidController {

    private final CovidServiceImpl covidService;


    @GetMapping("/covid19")
    public CovidRequest covid() {
        return covidService.covidResult();
    }

}
