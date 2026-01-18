package com.example.GoComentRideApplication.GoCometRideApplication.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "trips")
@Getter
@Setter
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long rideId;
    private Long driverId;

    private String status; // STARTED, PAUSED, ENDED

    private Double fare;
}
