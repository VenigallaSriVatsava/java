package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ContainsnumTest {
    Containsnum obj = new Containsnum();

    @Test
    void containsDigits() {
        boolean actual = obj.containsDigits("0ad");
        assertEquals(false, actual);
    }

    @Test
    void containsDigitsEmpty() {
        boolean actual1 = obj.containsDigits("");
        assertEquals(true, actual1);
    }

    @Test
    void containsDigitNull() {
        assertThrows(RuntimeException.class, () -> obj.containsDigits(null));

    }
}