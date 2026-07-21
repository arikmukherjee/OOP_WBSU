import java.util.Scanner;

public class A50 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        try {

            // Arithmetic Exception
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int c = a / b;

            System.out.println("Division Result = " + c);

            // Array Index Exception
            int arr[] = new int[5];

            System.out.print(
                "Enter array index (0-4): ");

            int index = sc.nextInt();

            arr[index] = 100;

            System.out.println(
                "Value inserted successfully");

            // Null Pointer Exception
            String s = null;

            System.out.println(
                "Length of String = " + s.length());
        }

        catch (ArithmeticException e) {

            System.out.println(
                "Arithmetic Exception: Cannot divide by zero");
        }

        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                "Array Index Out Of Bounds Exception");
        }

        catch (NullPointerException e) {

            System.out.println(
                "Null Pointer Exception Occurred");
        }

        catch (Exception e) {

            System.out.println(
                "Invalid Input Exception");
        }

        finally {

            System.out.println(
                "Program Finished");
        }

        sc.close();
    }
}