package com.example.controller;

import com.example.entity.Flight;
import com.example.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/flight/")
public class FlightController {
    @Autowired
    FlightService flightService;

    @GetMapping("/allFlight")
    public ResponseEntity<List<Flight>> getAllFlight(){
        return new  ResponseEntity<List<Flight>>(flightService.getAllFlight(), HttpStatus.OK);
    }


}
