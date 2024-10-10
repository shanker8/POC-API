package com.example.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
@Entity
@Table(name = "state")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Automatically generate the ID
    private long id;

    @JsonProperty("state")
    private String state;

    @JsonProperty("fips")
    private int fips;

    @JsonProperty("total")
    private long total;

    @JsonProperty("non_hispanic")
    private long nonHispanic;

    @JsonProperty("white_non_hispanic")
    private long whiteNonHispanic;

    @JsonProperty("black_non_hispanic")
    private long blackNonHispanic;

    @JsonProperty("indian_non_hispanic")
    private long indianNonHispanic;

    @JsonProperty("asian_non_hispanic")
    private long asianNonHispanic;

    @JsonProperty("hawaiian_non_hispanic")
    private long hawaiianNonHispanic;

    @JsonProperty("other_non_hispanic")
    private long otherNonHispanic;

    @JsonProperty("two_or_more_non_hispanic")
    private long twoOrMoreNonHispanic;

    @JsonProperty("hispanic")
    private long hispanic;

    @JsonProperty("white_hispanic")
    private long whiteHispanic;

    @JsonProperty("black_hispanic")
    private long blackHispanic;

    @JsonProperty("indian_hispanic")
    private long indianHispanic;

    @JsonProperty("asian_hispanic")
    private long asianHispanic;

    @JsonProperty("hawaiian_hispanic")
    private long hawaiianHispanic;

    @JsonProperty("other_hispanic")
    private long otherHispanic;

    @JsonProperty("two_or_more_hispanic")
    private long twoOrMoreHispanic;

    @JsonProperty("white_total")
    private long whiteTotal;

    @JsonProperty("black_total")
    private long blackTotal;

    @JsonProperty("indian_total")
    private long indianTotal;

    @JsonProperty("asian_total")
    private long asianTotal;

    @JsonProperty("hawaiian_total")
    private long hawaiianTotal;

    @JsonProperty("other_total")
    private long otherTotal;

    @JsonProperty("two_or_more_total")
    private long twoOrMoreTotal;

    @JsonProperty("white_hispanic_perc")
    private double whiteHispanicPerc;

    @JsonProperty("white_non_hispanic_perc")
    private double whiteNonHispanicPerc;

    @JsonProperty("black_hispanic_perc")
    private double blackHispanicPerc;

    @JsonProperty("black_non_hispanic_perc")
    private double blackNonHispanicPerc;

    @JsonProperty("indian_hispanic_perc")
    private double indianHispanicPerc;

    @JsonProperty("indian_non_hispanic_perc")
    private double indianNonHispanicPerc;

    @JsonProperty("asian_hispanic_perc")
    private double asianHispanicPerc;

    @JsonProperty("asian_non_hispanic_perc")
    private double asianNonHispanicPerc;

    @JsonProperty("hawaiian_hispanic_perc")
    private double hawaiianHispanicPerc;

    @JsonProperty("hawaiian_non_hispanic_perc")
    private double hawaiianNonHispanicPerc;

    @JsonProperty("other_hispanic_perc")
    private double otherHispanicPerc;

    @JsonProperty("other_non_hispanic_perc")
    private double otherNonHispanicPerc;

    @JsonProperty("two_or_more_hispanic_perc")
    private double twoOrMoreHispanicPerc;

    @JsonProperty("two_or_more_non_hispanic_perc")
    private double twoOrMoreNonHispanicPerc;

    @JsonProperty("white_total_perc")
    private double whiteTotalPerc;

    @JsonProperty("black_total_perc")
    private double blackTotalPerc;

    @JsonProperty("indian_total_perc")
    private double indianTotalPerc;

    @JsonProperty("asian_total_perc")
    private double asianTotalPerc;

    @JsonProperty("hawaiian_total_perc")
    private double hawaiianTotalPerc;

    @JsonProperty("other_total_perc")
    private double otherTotalPerc;

    @JsonProperty("two_or_more_total_perc")
    private double twoOrMoreTotalPerc;
}