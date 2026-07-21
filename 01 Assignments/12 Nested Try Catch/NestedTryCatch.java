public class NestedTryCatch {
    public static void main(String[] args) {

        try {
            // Outer try block
            int arr[] = {10, 20, 30};

            // Inner try block
            try {
                System.out.println("Accessing element: " + arr[5]); // ArrayIndexOutOfBounds
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner Catch: Array index is out of range");
            }

            // Another inner try block
            try {
                int x = 10 / 0; // ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Inner Catch: Cannot divide by zero");
            }

        } catch (Exception e) {
            // Outer catch block
            System.out.println("Outer Catch: General Exception");
        }

        System.out.println("Program continues...");
    }
}