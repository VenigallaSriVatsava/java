package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReplaceTest {
    Replace obj = new Replace();

    @Test
    void replaceChar() {
        String actual = obj.replaceChar("post", 't', 'e');
        assertEquals("pose", actual);
        String actual1 = obj.replaceChar("J.Snow", 'n', 'l');
        assertEquals("J.Slow", actual1);
        String actual2 = obj.replaceChar("madam", 'm', ' ');
        assertEquals(" ada ", actual2);
    }

    @Test
    void noreplaceChar() {
        String actual = obj.replaceChar("post", 'j', 'e');
        assertEquals("post", actual);
    }
}