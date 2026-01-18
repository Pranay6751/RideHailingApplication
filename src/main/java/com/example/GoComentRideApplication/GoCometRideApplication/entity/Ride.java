package com.example.GoComentRideApplication.GoCometRideApplication.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "rides")
@Getter
@Setter
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long riderId;

    private String status; // REQUESTED, MATCHED, CANCELLED

    private Double pickupLat;
    private Double pickupLng;

    private Double destLat;
    private Double destLng;

    private Double surgeMultiplier;
}
