package operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssignmentTest {

    Assignment obj = new Assignment();
    @Test
    void testEquals() {
      int actual =  obj.equals(8);
      assertEquals(8,actual);
    }

    @Test
    void add() {
        int actual = obj.add(6);
        assertEquals(13,actual);
    }

    @Test
    void subtract() {
        int actual = obj.subtract(5);
        assertEquals(-1,actual);
    }

    @Test
    void multiply() {
        int actual = obj.multiply(6);
        assertEquals(12,actual);
    }

    @Test
    void divide() {
        float actual = obj.divide(8);
        assertEquals(4,actual);
    }

    @Test
    void modulus() {
        int actual = obj.modulus(9);
        assertEquals(1,actual);
    }
}