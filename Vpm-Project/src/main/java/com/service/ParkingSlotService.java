package com.service;

import java.util.List;

import com.model.ParkingSlot;

public interface ParkingSlotService {
    List<ParkingSlot> getAllParkingSlots();
    ParkingSlot getParkingSlotById(Long id);
    List<ParkingSlot> getAvailableParkingSlots();
    ParkingSlot saveParkingSlot(ParkingSlot parkingSlot);
    void deleteParkingSlot(Long id);
}

