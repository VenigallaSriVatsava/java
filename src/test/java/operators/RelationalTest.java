package operators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelationalTest {

    Relational obj = new Relational();
    @Test
    void testEquals() {
      boolean actual =  obj.equals(7,9);
        assertEquals(false,actual);
    }

    @Test
    void greaterthan() {
        boolean actual = obj.greaterthan(6,18);
        assertEquals(false,actual);
    }

    @Test
    void lessthan() {
        boolean actual = obj.lessthan(6,7);
        assertEquals(true,actual);
    }

    @Test
    void greaterthanOrEquals() {
        boolean actual = obj.greaterthanOrEquals(14,14);
        assertEquals(true,actual);
    }

    @Test
    void lessthanOrEquals() {
        boolean actual = obj.lessthanOrEquals(8,9);
        assertEquals(true,actual);
    }
}