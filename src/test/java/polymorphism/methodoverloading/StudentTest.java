package polymorphism.methodoverloading;

import oopsConcepts.polymorphism.methodoverloading.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


    @Test
    void testSetName() {

        Student s = new Student();

        s.setName("Sri", "Vatsava");
        assertTrue(s.getFirstName().equals("Sri"));
        assertTrue(s.getLastName().equals("Vatsava"));

        s.setName("Sri");
        assertTrue(s.getFirstName().equals("Sri"));
        assertTrue(s.getLastName().equals("N/A"));
    }
}