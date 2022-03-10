package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoverepeatedTest {
    Removerepeated obj = new Removerepeated();

    @Test
    void removeDuplicate() {
        String actual = obj.removeDuplicate("completed");
        assertEquals("completd", actual);

        String actual1 = obj.removeDuplicate("school");
        assertEquals("schol", actual1);

    }
}