package com.example.entity;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
public class Flight {
    private Integer id;
    private String destination;
    private String duration;
    private LocalDate flightDate;
    private LocalTime flightTime;
    private Integer flightNo;
    private Fare fare;
    private Inventory inventory;
    private FlightInfo flightInfo;

}
