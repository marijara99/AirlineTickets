package com.airlines.solera.model;

import javax.persistence.Entity;

@Entity
public class Users {

    private String firstName;
    private String lastName;
    private String nationality;
    private String identification;
    private Integer age;
    private Boolean luggage;
}
