package com.nikolic.matchsimulator.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int ranking;

    private PlayerPosition position;


}
