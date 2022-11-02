package com.example.entity;

import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
public class Fare {
    private Integer id;
    private BigDecimal fare;
}
