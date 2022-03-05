package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    Anagram obj = new Anagram();

    @Test
    void checkAnagram() {
        assertTrue(obj.checkAnagram("stop", "post"));
        assertTrue(obj.checkAnagram_withoutHashMap("stop", "post"));
    }

    @Test
    void CheckAnagram_null() {
        assertThrows(
                RuntimeException.class,
                () -> obj.checkAnagram("java", null)
        );

        // assertTrue(thrown.getMessage().contains("invalid input"));

        RuntimeException thrown1 = assertThrows(
                RuntimeException.class,
                () -> obj.checkAnagram(null, null),
                "Expected checkAnagram() to throw, but it didn't"
        );

        assertTrue(thrown1.getMessage().contains("invalid input"));

        RuntimeException thrown2 = assertThrows(
                RuntimeException.class,
                () -> obj.checkAnagram_withoutHashMap(null, null),
                "Expected checkAnagram() to throw, but it didn't"
        );
        assertTrue(thrown2.getMessage().contains("invalid input"));
    }

    @Test
    void checkAnagram_empty() {
        assertThrows(RuntimeException.class, () -> obj.checkAnagram("", ""));

        assertThrows(RuntimeException.class, () -> obj.checkAnagram_withoutHashMap("", ""));
    }

    @Test
    void checkAnagram_false() {
        assertFalse(obj.checkAnagram("stop", "posts"));
        assertFalse(obj.checkAnagram("host", "most"));
        assertFalse(obj.checkAnagram_withoutHashMap("stop", "posts"));
        assertFalse(obj.checkAnagram_withoutHashMap("host", "most"));
        assertFalse(obj.checkAnagram_withoutHashMap("java", "javc"));
    }

}