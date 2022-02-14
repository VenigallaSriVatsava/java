package oopsConcepts.polymorphism.methodoverriding;

public class Car extends Vehicle { // child class
    private String fuelType;
    private int SeatingCap;
    private int handling;

    public String makeSound()
    {
        return "honk honk..";
    }
}
