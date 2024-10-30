package com.pluralsight;

public class Cat extends Animal {

    public Cat(){
        super.setSpecies("Cat");
    }

    public void meow(){
        System.out.println("MEOW!");
    }
}