package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("yellow car", "May 12", "1000.00", "Toya",2020, 100001);
        System.out.println(car.getValue());

        ArrayList<Asset> assets = new ArrayList<Asset>();
        assets.add(new House("Main House", "2022-12-11", "300000", "The Forest", 1,30000, 10000));
        assets.add(new Vehicle("yellow car", "May 12", "1000.00", "Toya",2020, 100001));
        assets.add(new House("Vacation House", "2022-12-11", "300000", "The Forest", 1,30000, 10000));
        assets.add(new Vehicle("blue car", "May 12", "1000.00", "Toya",2020, 100001));

    }
}