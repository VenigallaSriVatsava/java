package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversenewTest {

    Reversenew obj = new Reversenew();

    @Test
    void reverseNonRecursive() {
        String actual = obj.reverseNonRecursive("complex");
        assertEquals("xelpmoc", actual);

        String actual1 = obj.reverseNonRecursive("dreams");
        assertEquals("smaerd", actual1);

        String actual2 = obj.reverseNonRecursive("madam");
        assertEquals("madam", actual2);
    }
}