package oopsConcepts.polymorphism.methodoverriding;

public class Vehicle {  // parent class
    private String make;
    private String model;
    private int noOfWheels;

    public String makeSound() {
        return "You haven't given me a sound yet" ;
    }
}
