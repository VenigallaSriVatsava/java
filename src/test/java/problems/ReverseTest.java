package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ReverseTest {

    Reverse obj = new Reverse();

    @Test
    void stringReverse() {
        String actual = obj.string_reverse("javaj");
        assertEquals("javaj", actual);

        String actual1 = obj.stringReverseRecursive("water");
        assertEquals("retaw", actual1);
    }

    @Test
    void stringReverseEmpty() {
        String actual = obj.string_reverse("");
        assertEquals("", actual);
    }

    @Test
    void stringReverseNull() {
        assertThrows(RuntimeException.class, () -> obj.stringReverseRecursive(null));

    }
}