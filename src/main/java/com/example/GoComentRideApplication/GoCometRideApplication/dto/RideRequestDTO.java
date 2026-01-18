package com.example.GoComentRideApplication.GoCometRideApplication.dto;

import lombok.Data;

@Data
public class RideRequestDTO {
    public Double pickupLat;
    public Double pickupLng;
    public Double destLat;
    public Double destLng;
    public String paymentMethod;
}

