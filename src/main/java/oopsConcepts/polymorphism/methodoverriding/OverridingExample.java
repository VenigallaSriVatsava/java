package oopsConcepts.polymorphism.methodoverriding;

public class OverridingExample {

    public static void main(String[] args) {
        Car obj1 = new Car();
        Bicycle obj2 = new Bicycle();
        Vehicle obj3 = new Vehicle();

        System.out.println("car makes " + obj1.makeSound());
        System.out.println("Bicycle makes " + obj2.makeSound());
        System.out.println(obj3.makeSound());

    }
}
