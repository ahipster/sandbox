package se.seb.mdm.sandbox.domain;

import java.util.List;

public class Car extends RegisteredVehicle {

    public String color;

    private List<Wheel> wheels;


    public Car(String registrationNumber, String color, List<Wheel> wheels) {
        this.registrationNumber = registrationNumber;
        this.color = color;
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }
}
