import java.util.Scanner;

// Step 1: Create your own exception by extending Exception
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

// Main class
public class OwnException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            // Step 2: Throw custom exception
            if (age < 18) {
                throw new InvalidAgeException("You are not eligible (Age must be 18+)");
            } else {
                System.out.println("You are eligible!");
            }
        } catch (InvalidAgeException e) {
            // Step 3: Handle exception
            System.out.println("Exception caught: " + e.getMessage());
        }

        sc.close();
    }
}