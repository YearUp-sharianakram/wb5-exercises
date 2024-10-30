package com.pluralsight;

public class Dog extends Animal{
    private String breed;

    public Dog(){
        super.setSpecies("Dog");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    private String breed;

    public void bark(){
        if(super.getWeight() < 50){
            System.out.println("BARK");
        }
        else{
            System.out.println("WOOF");
        }
    }


}