package org.example.exe0.object.abstraction;

abstract class Animal {
    abstract void walk();
    void breatche(){
        System.out.println("This animal breathes air");
    }
    Animal(){
        System.out.println("You are about to create an Animal");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Wow, You have created a Horse");
    }
    @Override
    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}
class Chicken extends Animal{
    Chicken(){
        System.out.println("Wow, you have created a Chicken");
    }
    @Override
    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}
public class OOPS{
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();
        horse.breatche();
    }
}
