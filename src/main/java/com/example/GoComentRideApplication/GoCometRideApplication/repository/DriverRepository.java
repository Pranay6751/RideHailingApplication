package com.example.GoComentRideApplication.GoCometRideApplication.repository;


import com.example.GoComentRideApplication.GoCometRideApplication.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
}

