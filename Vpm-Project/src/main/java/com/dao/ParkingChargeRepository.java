package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.ParkingCharge;

public interface ParkingChargeRepository extends JpaRepository<ParkingCharge, Long> {
    List<ParkingCharge> findByVehicleId(Long vehicleId);
}

