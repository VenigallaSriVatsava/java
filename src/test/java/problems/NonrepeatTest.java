package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NonrepeatTest {
    Nonrepeat obj = new Nonrepeat();

    @Test
    void nonRepeatingCharacter_normal() {
        char actual = obj.nonRepeatingCharacter("most");
        assertEquals('m', actual);

        char actual2 = obj.nonRepeatingCharacter_2("mmoo");
        assertEquals(' ', actual2);
    }

    @Test
    void noNonRepeatingCharacter() {
        char actual = obj.nonRepeatingCharacter("mostmost");
        assertEquals(' ', actual);
    }

    @Test
    void nonRepeatingCharacter_empty() {
        assertThrows(RuntimeException.class, () -> obj.nonRepeatingCharacter(null));
    }

    @Test
    void nonRepeatingCharacter_inMiddle() {
        char actual = obj.nonRepeatingCharacter("mosom");
        assertEquals('s', actual);
    }

    @Test
    void nonRepeatingCharacter_null() {

        assertThrows(RuntimeException.class, () -> obj.nonRepeatingCharacter(null));
    }
    

}