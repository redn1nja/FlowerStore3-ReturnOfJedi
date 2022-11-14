package com.User;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;


@Getter @Setter
public class AppUser {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private int age;
    private LocalDate dob;

}
