package com.example.GoComentRideApplication.GoCometRideApplication.repository;

import com.example.GoComentRideApplication.GoCometRideApplication.entity.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Ride, Long> {
}

