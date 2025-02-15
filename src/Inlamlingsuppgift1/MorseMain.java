package Inlamlingsuppgift1;
import java.util.Scanner;

    public class MorseMain {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            MorseLogic morseLogic = new MorseLogic();

            System.out.println("Välj ett alternativ:");
            System.out.println("1. Konvertera morsekod till engelska");
            System.out.println("2. Konvertera engelska till morsekod");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Rensa buffer

            switch (choice) {
                case 1:
                    System.out.print("Ange morsekod (separera med mellanslag): ");
                    String morseCode = scanner.nextLine();
                    try {
                        String result = morseLogic.convertMorseToEnglish(morseCode);
                        System.out.println("Resultat: " + result);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Fel: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Ange text på engelska: ");
                    String englishText = scanner.nextLine();
                    try {
                        String result = morseLogic.convertEnglishToMorse(englishText);
                        System.out.println("Resultat: " + result);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Fel: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Ogiltigt val.");
            }
        }
    }
