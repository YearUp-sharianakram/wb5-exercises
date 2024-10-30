package com.pluralsight;

public class SemiTruck extends Vehicle {


    private String cargo;
    private float cargoWeight;
    private boolean hasTrailer;

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String vehicleType, boolean isGasoline, boolean isElectric, boolean isManual, float speedCurrent, float speedMax, String cargo, float cargoWeight, boolean hasTrailer) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, vehicleType, isGasoline, isElectric, isManual, speedCurrent, speedMax);
        this.cargo = cargo;
        this.cargoWeight = cargoWeight;
        this.hasTrailer = hasTrailer;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(float cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    public void sound(){
        System.out.println("BRRRRRRRRMMMM”");
    }
}
