package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RepeatcharTest {
    Repeatchar obj = new Repeatchar();

    @Test
    void repeatingChar() {
        int actual = obj.repeatingChar("prograr");
        assertEquals("r", actual);
    }
}