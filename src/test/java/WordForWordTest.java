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

    //Test wc()
    @Test
    void wcTest() {
        //Given
        WordForWord wfw = new WordForWord();

        //When
        WCResult result = wfw.wc("The Blue Fox is blue.");

        //Then
        //Null test
        assertNotNull(result);
        //Words test
        assertEquals(5L, result.getWords());
        //Lines test
        assertEquals(1L, result.getLines());
        //Characters test
        assertEquals(21L, result.getCharacters());
    }

    //Edge case
    @Test
    void wcWithNewlinesTest() {
        //Given
        WordForWord wfw = new WordForWord();

        //When
        WCResult result = wfw.wc("Hello\nWorld");

        //Then
        //Null test
        assertNotNull(result);
        //Words test
        assertEquals(2L, result.getWords());
        //Lines test
        assertEquals(2L, result.getLines());
        //Characters test
        assertEquals(11L, result.getCharacters());
    }

    // Edge case
    @Test
    void wcEmptyStringTest() {
        //Given
        WordForWord wfw = new WordForWord();

        //When
        WCResult result = wfw.wc("");

        //Then
        //Null test
        assertNotNull(result);
        //Words test
        assertEquals(0L, result.getWords());
        //Lines test
        assertEquals(0L, result.getLines());
        //Characters test
        assertEquals(0L, result.getCharacters());
    }

    // Edge Case
    @Test
    void wcTrailingNewlineTest() {
        //Given
        WordForWord wfw = new WordForWord();

        //When
        WCResult result = wfw.wc("Hello World\n");

        //Then
        //Null test
        assertNotNull(result);
        //Words test
        assertEquals(2L, result.getWords());
        //Lines test
        assertEquals(1L, result.getLines());
        //Characters test
        assertEquals(12L, result.getCharacters());
    }

    //Edge case
    @Test
    void wcIrregularWhitespaceTest() {
        //Given
        WordForWord wfw = new WordForWord();

        //When
        WCResult result = wfw.wc("  Hello    World \t ");

        //Then
        //Null test
        assertNotNull(result);
        //Words test
        assertEquals(2L, result.getWords());
        //Lines test
        assertEquals(1L, result.getLines());
        //Characters test
        assertEquals(19L, result.getCharacters());
    }

    //Edge case
    @Test
    void wcNullInputTest() {
        //Given
        WordForWord wfw = new WordForWord();

        //When
        WCResult result = wfw.wc(null);

        //Then
        //Null test
        assertNotNull(result);
        //Words test
        assertEquals(0L, result.getWords());
        //Lines test
        assertEquals(0L, result.getLines());
        //Characters test
        assertEquals(0L, result.getCharacters());
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
