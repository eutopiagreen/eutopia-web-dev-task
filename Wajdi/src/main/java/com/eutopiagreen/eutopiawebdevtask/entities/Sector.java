package com.eutopiagreen.eutopiawebdevtask.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "sectors")
@Data
public class Sector {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    @Column(name = "id")
    private Long ID;
    @JsonProperty("label")
    private String name;

}

