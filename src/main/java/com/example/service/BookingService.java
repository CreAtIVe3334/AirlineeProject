package com.example.service;

import com.example.entity.Flight;
import com.example.entity.User;
import com.example.repository.FlightRepository;
import com.example.repository.PassengerRepository;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BookingService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerRepository passengerRepository;

    public boolean buyFlight(Integer userId,Integer flightId){
        boolean boughted = false;
        User userDB=userRepository.findById(userId).get();
        Flight flightDB = flightRepository.findById(flightId).get();

        userDB.setMoney(userDB.getMoney().subtract(flightDB.getFare().getFare()).setScale(2));
        flightDB.getFlightInfo().setCountSeets(flightDB.getFlightInfo().getCountSeets()-1);

        userRepository.save(userDB);
        return boughted;
    }
}
