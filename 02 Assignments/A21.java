import java.util.Scanner;

public class A21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // 1. length()
        System.out.println("Length of string: " + str.length());

        // 2. toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // 3. toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // 4. charAt()
        System.out.println("Character at index 2: " + str.charAt(2));

        // 5. substring()
        System.out.println("Substring (0 to 3): " + str.substring(0, 3));
    }
}