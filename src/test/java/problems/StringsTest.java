package problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringsTest {
    Strings obj = new Strings();


    @Test
    void printDuplicates() {
        List<String> actual = obj.printDuplicates("java");
        assertEquals("a repeats 2 times", actual.get(0));
    }

    @Test
    void printDuplicates_EmptyString() {
        List<String> actual = obj.printDuplicates("");
        assertEquals(0, actual.size());

    }

    @Test
    void printDuplicates_NullString() {
        List<String> actual = obj.printDuplicates(null);
        assertEquals(0, actual.size());
    }

    @Test
    void printDuplicates_MultipleDuplicates() {
        List<String> actual = obj.printDuplicates("javaav");
        assertEquals("a repeats 3 times", actual.get(0));
        assertEquals("v repeats 2 times", actual.get(1));
    }

}