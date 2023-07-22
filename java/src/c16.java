import java.util.*;

public class c16 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Go Question 2 press 1, Question 3 press 2, Question 4 press 3.");

        String inputs = input.next();

        if (inputs.equalsIgnoreCase("1")) {
            Question2();
        }
        if (inputs.equalsIgnoreCase("2")) {
            Question3();
        }
        if (inputs.equalsIgnoreCase("3")) {
            Question4();
        }

        // prevent resources leak
        input.close();
    }

    static void Question2() {
        System.out.println("Input 5 numbers :");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        int sum = num1 + num2 + num3 + num4 + num5;
        double avg = (num1 + num2 + num3 + num4 + num5) / 5;
        System.out.println("The sum of 5 no is " + sum);
        System.out.print("The Average is " + avg);

        input.close();
    }

    static void Question3() {
        System.out.print("The input term is : ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int cube = i * i * i;
            System.out.println("Number is : " + i + " And the cube of " + i + " is " + cube);
        }

        input.close();
    }

    static void Question4() {
        System.out.print("The input term is : ");
        int n = input.nextInt();
        int i = 1, sum = 0;
        while (i <= n) {
            int odd = 2 * i - 1;
            if (odd % 2 != 0) {
                System.out.println(odd);
            }
            sum += odd;
            i++;
        }
        System.out.println("The Sum of odd Natural Numbers up to " + n + " terms is: " + sum);

        input.close();
    }

}