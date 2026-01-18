package com.example.GoComentRideApplication.GoCometRideApplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideDTO {
    public Double pickupLat;
    public Double pickupLng;
    public Double destLat;
    public Double destLng;
    public String status;
}