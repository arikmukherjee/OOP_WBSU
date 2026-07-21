public class StringFunc {

    public static void main(String[] args) {

        String str = "Hello Java World";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // 3. toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // 4. substring()
        System.out.println("Substring (0 to 5): " + str.substring(0, 5));

        // 5. contains()
        System.out.println("Contains 'Java': " + str.contains("Java"));
    }
}