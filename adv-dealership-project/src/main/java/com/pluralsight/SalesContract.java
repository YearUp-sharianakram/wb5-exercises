package com.pluralsight;

public class SalesContract extends Contract {
    private final double salesTaxAmount = .05;
    private final double recordingFee = 100.00;
    private double processingFee; // $295 for vehicles under $10,000 and 495 for over $10,000
    private boolean financeOption;

    public SalesContract(String date, String customerName, String customerEmail, Vehicle vehicleSold, boolean financeOption) {
        super(date, customerName, customerEmail, vehicleSold);
        this.processingFee = getProcessingFee();
        this.financeOption = financeOption;
    }

    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public double getProcessingFee() {
        double cost = super.getVehicleSold().price;
        if (cost < 10_000) {
            this.processingFee = 295;
        } else {
            this.processingFee = 495;
        }
        return processingFee;
    }


    public boolean isFinanceOption() {
        return financeOption;
    }

    public void setFinanceOption(boolean financeOption) {
        this.financeOption = financeOption;
    }

    @Override
    public double getTotalPrice() {
        double cost = super.getVehicleSold().price;
        double tax = cost * salesTaxAmount;
        return cost + tax + recordingFee + processingFee;
    }

    @Override
    public double getMonthlyPayment() {
        double cost = getTotalPrice();
        int termMonths;
        double interestRate;

        if (financeOption) {
            if (cost > 10_000) {
                termMonths = 48;
                interestRate = 0.0425;
                return (cost * interestRate) / termMonths;
            } else {

                interestRate = 0.0525;
                termMonths = 24;
                return (cost * interestRate) / termMonths;
            }

        }
        return 0.0;

    }
}
