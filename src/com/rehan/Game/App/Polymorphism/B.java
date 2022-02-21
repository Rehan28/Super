package com.rehan.Game.App.Polymorphism;

public class B extends A{
    int x =5;
    void getValue(){
        System.out.println("class B = "+x);
        System.out.println("class A = "+super.x);
        //variable super
    }
    @Override// method super
    void getMessages(){
        super.getMessages();
        System.out.println("In B class");
    }
}
