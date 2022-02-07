package oopsConcepts.polymorphism;

import oopsConcepts.Bicycle;
import oopsConcepts.Car;
import oopsConcepts.MotorCycle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class overriding {

    @Test
    public void testOverriding() {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        MotorCycle motorCycle = new MotorCycle();

        assertEquals("honk honk..", car.makeSound());
        assertEquals("You haven't given me a sound yet", motorCycle.makeSound());
        assertEquals("tring tring", bicycle.makeSound());
;    }
}
