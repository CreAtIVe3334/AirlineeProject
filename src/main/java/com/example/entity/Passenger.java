package com.example.entity;

import com.example.enums.Gender;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
@Entity
public
class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Email
    @NotEmpty
    @Column(unique = true,nullable = false)
    private String email;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;
    private Gender gender;
    @Column(nullable = false)
    private String phoneMunber;
    private String bookingId;
    @OneToOne(cascade = CascadeType.ALL)
    private Checkin checkin;

}
