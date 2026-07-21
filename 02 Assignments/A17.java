import java.util.Scanner;

public class A17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, count = 0;
        String text = "";

        System.out.print("Enter number of lines: ");
        n = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter the text:");

        for (int i = 0; i < n; i++) {
            text += sc.nextLine() + " ";
        }

        text = text.toLowerCase();


        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Total number of vowels: " + count);
    }
}