package com.firstspringproject.springapiproject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    private int id;
    private String name;
    private String country;
    private double avg;
    private int wickets;
    private int mom;
}
