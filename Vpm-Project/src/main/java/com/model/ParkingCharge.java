package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "parking_charges")
public class ParkingCharge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Long vehicle;
    @ManyToOne
    @JoinColumn(name = "parking_slot_id")
    private Long parkingSlot;
    private Double charge;
    private String paymentStatus;
    // getters and setters
    
    
    public Long getVehicleId() {
        return vehicle;
    }

    public Long getParkingSlotId() {
        return parkingSlot;
    }


    
  
       

}
