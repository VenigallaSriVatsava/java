package operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnaryTest {

    Unary obj = new Unary();
    @Test
    void unaryMinus() {
        int actual = obj.unaryMinus(12);
        assertEquals(-12,actual);
    }

    @Test
    void not() {
        boolean actual = obj.not(true);
        assertEquals(false,actual);
    }

    @Test
    void increment() {
        int actual = obj.increment(7,9);
        assertEquals(7,actual);
    }

    @Test
    void decrement() {
        int actual = obj.decrement(3,1);
        assertEquals(2,actual);
    }
}