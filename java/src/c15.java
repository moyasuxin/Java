import java.util.*;

public class c15 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter First int : ");
        int num1 = keyboard.nextInt();
        System.out.println("Enter Second int : ");
        int num2 = keyboard.nextInt();

        // addition
        int add = addition(num1, num2);

        // substraction
        int sub = substraction();

        // multiplication
        multiplication(num1, num2);

        System.out.println("Addition is : " + add);

        System.out.println("Substraction is : " + sub);

        // division
        division();

        keyboard.close();
    }

    private static int addition(int a, int b) {
        return a + b;
    }

    private static int substraction() {
        int a = 1, b = 1;
        return a - b;
    }

    private static void multiplication(int a, int b) {
        double x = a * b;

        System.out.println("Multiplication is : " + x);
    }

    static void division() {
        int a = 1, b = 1;
        double c = a / b;
        System.out.println("Division is : " + c);
    }
}
