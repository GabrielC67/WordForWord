import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WordForWordTest {
    @Test
    void testToString() {
    }

    @Test
    void printTest() {
    }

    @Test
    void wcTest() {
            WordForWord wfw = new WordForWord();

            WCResult result = wfw.wc("The Blue Fox is blue.");

            assertNotNull(result);
            assertEquals(5L, result.getWords());
            assertEquals(1L, result.getLines());
            assertEquals(21L, result.getCharacters());
        }

    @Test
    void wordFrequencyTest() {
    }

    @Test
    void letterFrequencyTest() {
    }

    @Test
    void frequencyTest() {
    }
}
