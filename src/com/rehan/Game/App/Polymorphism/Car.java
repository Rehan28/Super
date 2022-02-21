package com.rehan.Game.App.Polymorphism;

public class Car extends Vehicle{
     int gear;
    Car(String colour, double weight,int gear) {
        super(colour, weight);
        this.gear = gear;
    }
    @Override
    void getAttribute(){
        super.getAttribute();
        System.out.println("Gear = "+gear);
    }
}
