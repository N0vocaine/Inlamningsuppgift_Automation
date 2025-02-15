package Inlamlingsuppgift1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MorseLogicTest {
    private final MorseLogic morseLogic = new MorseLogic();

    @Test
    void testConvertMorseToEnglish() {
        assertEquals("HELLO", morseLogic.convertMorseToEnglish(".... . .-.. .-.. ---"));
    }

    @Test
    void testConvertEnglishToMorse() {
        assertEquals(".... . .-.. .-.. ---", morseLogic.convertEnglishToMorse("HELLO"));
    }

    @Test
    void testInvalidMorseCode() {
        assertThrows(IllegalArgumentException.class, () -> {
            morseLogic.convertMorseToEnglish("..-.-");
        });
    }

    @Test
    void testInvalidEnglishCharacter() {
        assertThrows(IllegalArgumentException.class, () -> {
            morseLogic.convertEnglishToMorse("HELLO123");
        });
    }

    @Test
    void testEmptyInput() {
        MorseLogic morseLogic = new MorseLogic();
        String result = morseLogic.convertMorseToEnglish(" ");
        assertEquals("", result); // Kontrollera att tom input ger tom sträng
    }
    }


