import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Vowel Counter Program ===");
        System.out.println("Enter 2-3 lines of text (press Enter after each line, Ctrl+Z to finish):");

        StringBuilder text = new StringBuilder();
        int lineCount = 0;

        // Read multiple lines of input
        while (scanner.hasNextLine() && lineCount < 3) {
            String line = scanner.nextLine();
            if (line.trim().isEmpty() && lineCount >= 2) {
                break; // Stop if empty line after at least 2 lines
            }
            text.append(line).append("\n");
            lineCount++;
            if (lineCount >= 3) break;
        }

        String inputText = text.toString().trim();

        if (inputText.isEmpty()) {
            System.out.println("No text entered. Please enter some text.");
            return;
        }

        // Count vowels
        int vowelCount = countVowels(inputText);

        // Display results
        System.out.println("\n=== Results ===");
        System.out.println("Input Text:");
        System.out.println(inputText);
        System.out.println("\nTotal Vowels: " + vowelCount);

        // Optional: Show vowel breakdown
        showVowelBreakdown(inputText);

        scanner.close();
    }

    // Method to count total vowels
    public static int countVowels(String text) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (char c : text.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }

    // Method to show breakdown of each vowel
    public static void showVowelBreakdown(String text) {
        int[] vowelCounts = new int[5]; // a, e, i, o, u
        String vowels = "aeiouAEIOU";
        String lowercaseText = text.toLowerCase();

        for (char c : lowercaseText.toCharArray()) {
            switch (c) {
                case 'a': vowelCounts[0]++; break;
                case 'e': vowelCounts[1]++; break;
                case 'i': vowelCounts[2]++; break;
                case 'o': vowelCounts[3]++; break;
                case 'u': vowelCounts[4]++; break;
            }
        }

        System.out.println("\nVowel Breakdown:");
        System.out.println("A/a: " + vowelCounts[0]);
        System.out.println("E/e: " + vowelCounts[1]);
        System.out.println("I/i: " + vowelCounts[2]);
        System.out.println("O/o: " + vowelCounts[3]);
        System.out.println("U/u: " + vowelCounts[4]);
    }
}