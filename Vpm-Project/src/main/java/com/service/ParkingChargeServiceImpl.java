package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ParkingChargeRepository;
import com.model.ParkingCharge;

@Service
public class ParkingChargeServiceImpl implements ParkingChargeService {
    @Autowired
    private ParkingChargeRepository parkingChargeRepository;
    
    @Override
    public List<ParkingCharge> getAllParkingCharges() {
        return parkingChargeRepository.findAll();
    }
    
    @Override
    public ParkingCharge getParkingChargeById(Long id) {
        return parkingChargeRepository.findById(id).orElseThrow();
    }
    
    @Override
    public List<ParkingCharge> getParkingChargesByVehicleId(Long vehicleId) {
        return parkingChargeRepository.findByVehicleId(vehicleId);
    }
    
    @Override
    public ParkingCharge saveParkingCharge(ParkingCharge parkingCharge) {
        return parkingChargeRepository.save(parkingCharge);
    }
    
    @Override
    public void deleteParkingCharge(Long id) {
        parkingChargeRepository.deleteById(id);
    }
    
    @Override
    public ParkingCharge updateParkingCharge(Long id, ParkingCharge parkingCharge) {
        ParkingCharge existingParkingCharge = parkingChargeRepository.findById(id).orElseThrow();
        existingParkingCharge.setVehicle(parkingCharge.getVehicleId());
        existingParkingCharge.setParkingSlot(parkingCharge.getParkingSlotId());
        existingParkingCharge.setCharge(parkingCharge.getCharge());
        // update other fields as needed
        return parkingChargeRepository.save(existingParkingCharge);
    }

}

