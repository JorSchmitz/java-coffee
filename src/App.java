import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Primitive Types: byte, short, int, long, float, double, char, boolean
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

        // Reference Types:
        Date now = new Date();
        System.out.println(now);
        String message = "Hello World" + "!!";
        String message2 = "c:\\Windows\\...";
        System.out.println(message2);
        int[] numbers = new int[5];
        int[] numbers2 = { 2, 3, 5, 1, 4 };
    }
}

// https://www.youtube.com/watch?v=eIrMbAQSU34 1:01:31
