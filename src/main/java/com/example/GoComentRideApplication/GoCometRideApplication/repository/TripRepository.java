package com.example.GoComentRideApplication.GoCometRideApplication.repository;

import com.example.GoComentRideApplication.GoCometRideApplication.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {
}

