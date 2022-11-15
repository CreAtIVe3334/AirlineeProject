package com.example.service;

import com.example.entity.Flight;
import com.example.entity.User;
import com.example.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
    @Autowired
    FlightRepository flightRepository;

    public List<Flight> getAllFlight(){
        return flightRepository.findAll();
    }

    public Flight flightSave(Flight flight){
        return flightRepository.save(flight);
    }



}
