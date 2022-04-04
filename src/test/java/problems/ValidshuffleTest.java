package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidshuffleTest {
    Validshuffle obj = new Validshuffle();

    @Test
    void validStringShuffle() {
        boolean actual = obj.validStringShuffle("abc", "def", "adebfc");
        assertEquals(true, actual);
    }
}