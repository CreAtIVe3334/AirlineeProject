package com.example.entity;

import com.example.enums.Gender;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
public class User {
    private Integer id;
    private String name;
    private String surname;
    private String phoneNumber;
    private Gender gender;
    private String userName;
    private String password;
}
