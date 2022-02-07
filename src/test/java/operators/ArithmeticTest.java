package operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticTest {
    Arithmetic obj = new Arithmetic();
    @Test
    void sum() {
       int actual =  obj.sum(6,7);
        assertEquals(13,actual);
    }

    @Test
    void subtraction() {
        int actual =  obj.subtraction(8,7);
        assertEquals(1,actual);
    }

    @Test
    void multiply() {
        int actual =  obj.multiply(6,7);
        assertEquals(42,actual);
    }

    @Test
    void divide() {
        float actual =  obj.divide(14,7);
        assertEquals(2,actual);
    }

    @Test
    void modulus() {
        int actual =  obj.modulus(9,7);
        assertEquals(2,actual);
    }
}