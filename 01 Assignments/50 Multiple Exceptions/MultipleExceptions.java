import java.io.*;
import java.util.*;

public class MultipleExceptions {
    public static void main(String[] args) {
        System.out.println("=== Multiple Exception Handling Demonstration ===\n");

        // Demonstrate different types of exceptions
        demonstrateArithmeticException();
        demonstrateArrayIndexOutOfBoundsException();
        demonstrateNullPointerException();
        demonstrateNumberFormatException();
        demonstrateFileNotFoundException();
        demonstrateClassCastException();
        demonstrateCustomException();

        System.out.println("\n=== All exception demonstrations completed ===");
    }

    // 1. ArithmeticException - Division by zero
    private static void demonstrateArithmeticException() {
        System.out.println("1. ArithmeticException Demonstration:");
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("   Caught ArithmeticException: " + e.getMessage());
        }
        System.out.println();
    }

    // 2. ArrayIndexOutOfBoundsException - Accessing invalid array index
    private static void demonstrateArrayIndexOutOfBoundsException() {
        System.out.println("2. ArrayIndexOutOfBoundsException Demonstration:");
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println("Accessing element at index 10: " + numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("   Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        System.out.println();
    }

    // 3. NullPointerException - Accessing methods on null object
    private static void demonstrateNullPointerException() {
        System.out.println("3. NullPointerException Demonstration:");
        try {
            String str = null;
            System.out.println("String length: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("   Caught NullPointerException: " + e.getMessage());
        }
        System.out.println();
    }

    // 4. NumberFormatException - Invalid number conversion
    private static void demonstrateNumberFormatException() {
        System.out.println("4. NumberFormatException Demonstration:");
        try {
            String invalidNumber = "abc123";
            int number = Integer.parseInt(invalidNumber);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("   Caught NumberFormatException: " + e.getMessage());
        }
        System.out.println();
    }

    // 5. FileNotFoundException - Trying to read non-existent file
    private static void demonstrateFileNotFoundException() {
        System.out.println("5. FileNotFoundException Demonstration:");
        try {
            FileReader file = new FileReader("nonexistent_file.txt");
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("   Caught FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("   Caught IOException: " + e.getMessage());
        }
        System.out.println();
    }

    // 6. ClassCastException - Invalid type casting
    private static void demonstrateClassCastException() {
        System.out.println("6. ClassCastException Demonstration:");
        try {
            Object obj = "Hello World";
            Integer number = (Integer) obj; // Trying to cast String to Integer
            System.out.println("Cast successful: " + number);
        } catch (ClassCastException e) {
            System.out.println("   Caught ClassCastException: " + e.getMessage());
        }
        System.out.println();
    }

    // 7. Custom Exception - User-defined exception
    private static void demonstrateCustomException() {
        System.out.println("7. Custom Exception Demonstration:");
        try {
            validateAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("   Caught InvalidAgeException: " + e.getMessage());
        }

        try {
            validateAge(25);
            System.out.println("   Age validation successful!");
        } catch (InvalidAgeException e) {
            System.out.println("   Caught InvalidAgeException: " + e.getMessage());
        }
        System.out.println();
    }

    // Method that throws custom exception
    private static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Age must be between 0 and 120. Provided: " + age);
        }
    }
}

// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}