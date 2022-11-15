package com.example.controller;

import com.example.entity.*;
import com.example.enums.Currency;
import com.example.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@RestController("/util/insertflightdata/")
public class UtilController {

    @Autowired
    FlightService flightService;
    @GetMapping("/insert")
    public void insertFlight(){
        String[] destination = {"Haydar Aliyev","Ataturk","Moscow"};
        String[] duration = {"U.S.A","Canada","Dubai"};
        LocalDate[] dates ={LocalDate.of(2022,11,10),LocalDate.of(2022,12,10),LocalDate.of(2022,11,10)};
        LocalTime[] times ={LocalTime.of(18,00),LocalTime.of(14,00),LocalTime.of(18,00)};
        BigDecimal[] fares = {new BigDecimal("200.00"),new BigDecimal("300"),new BigDecimal("500")};
        String[] flightNumbers={"1A","1B","2A"};
        for (int i = 0; i < 3; i++) {
            Flight flight=Flight.builder().destination(destination[i])
                    .duration(duration[i])
                    .flightDate(dates[i])
                    .flightTime(times[i])
                    .flightNo(flightNumbers[i])
                    .origin("Turkis Airline")
                    .fare(Fare.builder()
                    .currency(Currency.USD)
                    .fare(fares[i]).build())
                    .inventory(Inventory.builder().count(500).build())
                    .flightInfo(FlightInfo.builder().flightNumber("5A").countSeets(100).airline(Airline.builder().name("Hayday Aliyev").build()).build()).build();
            flightService.flightSave(flight);
        }
        System.out.println("ended");
    }
}
