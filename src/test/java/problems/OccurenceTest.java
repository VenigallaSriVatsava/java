package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OccurenceTest {
    Occurence obj = new Occurence();

    @Test
    void occurenceOfChar() {
        int actual = obj.occurenceOfChar("java", 'a');
        assertEquals(2, actual);
    }
    
    @Test
    void noOccurence() {
        int actual = obj.occurenceOfChar("come on", 'j');
        assertEquals(0, actual);
    }
}