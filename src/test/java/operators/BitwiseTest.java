package operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitwiseTest {
    Bitwise obj = new Bitwise();
    @Test
    void or() {
      int actual = obj.or(5,6);
      assertEquals(7,actual);
    }

    @Test
    void and() {
        int actual = obj.and(5,5);
        assertEquals(5,actual);
    }

    @Test
    void compliment() {
        int actual = obj.compliment(6);
        assertEquals(-7,actual);

    }

    @Test
    void xor() {
        int actual = obj.xor(4,8);
        assertEquals(12,actual);
    }
}