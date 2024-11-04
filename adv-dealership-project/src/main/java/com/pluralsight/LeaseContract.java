package com.pluralsight;

public class LeaseContract extends Contract{
    private double expectedEndingValue; // 50% of original value
    private double leaseFee; // 7% of the original price

    public LeaseContract(String date, String customerName, String customerEmail, Vehicle vehicleSold) {
        super(date, customerName, customerEmail, vehicleSold);
        this.expectedEndingValue = getExpectedEndingValue();
        this.leaseFee = getLeaseFee();
    }

    public double getExpectedEndingValue() {
        double cost = super.getVehicleSold().price;
        expectedEndingValue = .5 * cost;
        return expectedEndingValue;
    }

    public double getLeaseFee() {
        double cost = super.getVehicleSold().price;
        this.leaseFee = .07 * cost;
        return leaseFee;
    }

    @Override
    public double getTotalPrice(){
        double cost = super.getVehicleSold().price;
        return cost + leaseFee;
    }

    @Override
    public double getMonthlyPayment(){
        double cost = getTotalPrice();
        double termMonths = 36;
        double interestRate = 0.0425;
        return (cost * interestRate) / termMonths;
    }
}
