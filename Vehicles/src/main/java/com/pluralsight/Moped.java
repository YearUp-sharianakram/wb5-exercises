package com.pluralsight;

public class Moped  extends  Vehicle{
    private String underSeatStorage;


    public Moped(){

     }
    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String vehicleType, boolean isGasoline, boolean isElectric, boolean isManual, float speedCurrent, float speedMax, String underSeatStorage) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, vehicleType, isGasoline, isElectric, isManual, speedCurrent, speedMax);
        this.underSeatStorage = underSeatStorage;
    }

    public String getUnderSeatStorage() {
        return underSeatStorage;
    }

    public void setUnderSeatStorage(String underSeatStorage) {
        this.underSeatStorage = underSeatStorage;
    }
    public void sound(){
        System.out.println("wrrrr wrrrr");
    }
}
