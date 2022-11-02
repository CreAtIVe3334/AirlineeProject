package com.example.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
public class FlightInfo {
    private Integer id;
    private String no;
    private Integer countSeets;
}
