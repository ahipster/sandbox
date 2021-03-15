package se.seb.mdm.sandbox.service;

import se.seb.mdm.sandbox.domain.Car;

public class CarFinder implements VehicleFinder {

    @Override
    public Object findVehicle(String registrationNumber) {
        Car car = new Car(registrationNumber, "black", null);
        return car;
    }
}
