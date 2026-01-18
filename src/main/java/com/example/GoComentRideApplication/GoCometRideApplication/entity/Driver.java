package com.example.GoComentRideApplication.GoCometRideApplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "drivers")
@Getter
@Setter
public class Driver {

    @Id
    private Long id;

    private String status; // ONLINE, OFFLINE, ON_TRIP
}
