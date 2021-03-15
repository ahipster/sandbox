package se.seb.mdm.sandbox.service;

import se.seb.mdm.sandbox.domain.Motorcycle;

public class MororcycleFinder implements VehicleFinder {

    @Override
    public Object findVehicle(String registrationNumber) {
        Motorcycle motorcycle = new Motorcycle();
        return motorcycle;
    }
}
