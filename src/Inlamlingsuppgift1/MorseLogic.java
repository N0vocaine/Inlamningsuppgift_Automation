package Inlamlingsuppgift1;

import java.util.HashMap;

public class MorseLogic {
    private static final HashMap<String, String> morseToEnglish = new HashMap<>();
    private static final HashMap<String, String> englishToMorse = new HashMap<>();

    static {
        morseToEnglish.put(".-", "A");
        morseToEnglish.put("-...", "B");
        morseToEnglish.put("-.-.", "C");
        morseToEnglish.put("-..", "D");
        morseToEnglish.put(".", "E");
        morseToEnglish.put("..-.", "F");
        morseToEnglish.put("--.", "G");
        morseToEnglish.put("....", "H");
        morseToEnglish.put("..", "I");
        morseToEnglish.put(".---", "J");
        morseToEnglish.put("-.-", "K");
        morseToEnglish.put(".-..", "L");
        morseToEnglish.put("--", "M");
        morseToEnglish.put("-.", "N");
        morseToEnglish.put("---", "O");
        morseToEnglish.put(".--.", "P");
        morseToEnglish.put("--.-", "Q");
        morseToEnglish.put(".-.", "R");
        morseToEnglish.put("...", "S");
        morseToEnglish.put("-", "T");
        morseToEnglish.put("..-", "U");
        morseToEnglish.put("...-", "V");
        morseToEnglish.put(".--", "W");
        morseToEnglish.put("-..-", "X");
        morseToEnglish.put("-.--", "Y");
        morseToEnglish.put("--..", "Z");

        // Bygger upp englishToMorse
        for (String morse : morseToEnglish.keySet()) {
            englishToMorse.put(morseToEnglish.get(morse), morse);
        }
    }

    public String convertMorseToEnglish(String morseCode) {
        String[] morseLetters = morseCode.split(" ");
        StringBuilder englishText = new StringBuilder();

        for (String morse : morseLetters) {
            if (morseToEnglish.containsKey(morse)) {
                englishText.append(morseToEnglish.get(morse));
            } else {
                throw new IllegalArgumentException("Ogiltig morsekod: " + morse);
            }
        }
        return englishText.toString();
    }

    public String convertEnglishToMorse(String englishText) {
        StringBuilder morseCode = new StringBuilder();

        for (char letter : englishText.toUpperCase().toCharArray()) {
            if (englishToMorse.containsKey(String.valueOf(letter))) {
                morseCode.append(englishToMorse.get(String.valueOf(letter))).append(" ");
            } else {
                throw new IllegalArgumentException("Ogiltigt tecken i text: " + letter);
            }
        }
        return morseCode.toString().trim();
    }
}
