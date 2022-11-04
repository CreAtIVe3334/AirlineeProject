package com.example.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String destination;
    private String duration;
    private LocalDate flightDate;
    private LocalTime flightTime;
    private Integer flightNo;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Fare fare;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Inventory inventory;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private FlightInfo flightInfo;

}
