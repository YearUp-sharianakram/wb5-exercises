package com.pluralsight;

public class Car extends Vehicle {

    private String truckContents;
    private String airFreshenerType;

    public Car(){

    }

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String vehicleType, boolean isGasoline, boolean isElectric, boolean isManual, float speedCurrent, float speedMax, String truckContents, String airFreshenerType) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, vehicleType, isGasoline, isElectric, isManual, speedCurrent, speedMax);
        this.truckContents = truckContents;
        this.airFreshenerType = airFreshenerType;
    }

    public String getTruckContents() {
        return truckContents;
    }

    public void setTruckContents(String truckContents) {
        this.truckContents = truckContents;
    }

    public String getAirFreshenerType() {
        return airFreshenerType;
    }

    public void setAirFreshenerType(String airFreshenerType) {
        this.airFreshenerType = airFreshenerType;
    }

    public void sound(){
        System.out.println("vroom vroom");
    }
}
