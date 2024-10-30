package com.pluralsight;

import java.time.LocalDate;
import java.util.Objects;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;


    public Vehicle(String description, String dateAcquired, String originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue(){
        int currentYear = LocalDate.now().getYear();
        int differenceInYears = currentYear - this.year;
        double value = 0.0;
        if (0 <= differenceInYears && differenceInYears <= 3 ){
            System.out.println("Line 49");
            value = super.getValue() * .97;
            if (odometer > 100_000 && (!makeModel.equalsIgnoreCase("Honda") && (!makeModel.equalsIgnoreCase("Toyota")))){
                value = value - (value * .25);
            }
        }else if (4 <= differenceInYears && differenceInYears <= 6 ){
            value = super.getValue() * .94;
            if (odometer > 100_000 && (!makeModel.equalsIgnoreCase("Honda") && (!makeModel.equalsIgnoreCase("Toyota")))){
                value = value - (value * .25);
            }
        } else if (7 <= differenceInYears && differenceInYears <= 10 ){
            value = super.getValue() * .92;
            if (odometer > 100_000 && (!makeModel.equalsIgnoreCase("Honda") && (!makeModel.equalsIgnoreCase("Toyota")))){
                value = value - (value * .25);
            }
        }else{
            value = 10_000;
            if (odometer > 100_000 && (!makeModel.equalsIgnoreCase("Honda") && (!makeModel.equalsIgnoreCase("Toyota")))){
                value = value - (value * .25);
            }
        }
        return value;

    }

}
