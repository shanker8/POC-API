package com.example.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "STATE")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "STATE")
    private String state;

    @Column(name = "TOTAL")
    private int total;

    @Column(name = "WHITE_TOTAL_PERC")
    private double whiteTotalPerc;

    @Column(name = "BLACK_TOTAL_PERC")
    private double blackTotalPerc;

    @Column(name = "INDIAN_TOTAL_PERC")
    private double indianTotalPerc;

    @Column(name = "ASIAN_TOTAL_PERC")
    private double asianTotalPerc;

    @Column(name = "HAWAIIAN_TOTAL_PERC")
    private double hawaiianTotalPerc;

    @Column(name = "OTHER_TOTAL_PERC")
    private double otherTotalPerc;

    @Column(name = "TWO_OR_MORE_TOTAL_PERC")
    private double twoOrMoreTotalPerc;
}