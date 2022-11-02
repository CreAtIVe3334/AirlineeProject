package com.example.entity;

import com.example.enums.Gender;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
@Entity
class Passengers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String email;
    private String name;
    private String surame;
    private Gender gender;
    private String phoneMunber;
    private String bookingId;
    private Checkin checkin;

}
