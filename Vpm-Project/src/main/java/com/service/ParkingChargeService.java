package com.service;

import java.util.List;

import com.model.ParkingCharge;

public interface ParkingChargeService {
    List<ParkingCharge> getAllParkingCharges();
    ParkingCharge getParkingChargeById(Long id);
    List<ParkingCharge> getParkingChargesByVehicleId(Long vehicleId);
    ParkingCharge saveParkingCharge(ParkingCharge parkingCharge);
    void deleteParkingCharge(Long id);
	ParkingCharge updateParkingCharge(Long id, ParkingCharge parkingCharge);
	
}

