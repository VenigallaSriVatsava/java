package operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicalTest {

    Logical obj = new Logical();

    @Test
    void evenAndPrime() {
     boolean actual =  obj.evenAndPrime(1);
     assertEquals(false,actual);
    }

    @Test
    void evenOrPrime() {
        boolean actual =  obj.evenOrPrime(1);
        assertEquals(false,actual);
    }

    @Test
    void not() {
        boolean actual = obj.not(4);
        assertEquals(false,actual);
    }
}