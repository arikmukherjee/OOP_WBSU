public class A12 {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int r = a / b;
            System.out.println(r);
        } catch (ArithmeticException e) {
            try {
                int x[] = new int[3];
                x[5] = 10;
            } catch (ArrayIndexOutOfBoundsException a) {
                System.out.println("Inner catch");
            }
            System.out.println("Outer catch");
        }
        System.out.println("End of code");
    }
}