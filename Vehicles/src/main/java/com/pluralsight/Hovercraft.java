package com.pluralsight;

public class Hovercraft extends Vehicle {
    private boolean onWater;
    private float hoverHeight;

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String vehicleType, boolean isGasoline, boolean isElectric, boolean isManual, float speedCurrent, float speedMax, float hoverHeight, boolean onWater) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, vehicleType, isGasoline, isElectric, isManual, speedCurrent, speedMax);
        this.hoverHeight = hoverHeight;
        this.onWater = onWater;
    }

    public boolean isOnWater() {
        return onWater;
    }

    public void setOnWater(boolean onWater) {
        this.onWater = onWater;
    }

    public float getHoverHeight() {
        return hoverHeight;
    }

    public void setHoverHeight(float hoverHeight) {
        this.hoverHeight = hoverHeight;
    }
    public void sound(){
        System.out.println("WHRRRRRRRR... VVVVVV... FFFFFWOOOSH...");
    }

}
