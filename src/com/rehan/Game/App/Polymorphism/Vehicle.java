package com.rehan.Game.App.Polymorphism;

public class Vehicle {
    String colour;
    double weight;
    Vehicle(String colour,double weight){
        this.colour = colour;
        this.weight = weight;
    }
    void getAttribute(){
        System.out.println("Colour = "+colour);
        System.out.println("Weight = "+weight);
    }
}
