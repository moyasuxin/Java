import java.util.*;

public class c13 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean continueCalculating = true;

        System.out.println("Ounces Calculator");
        while (continueCalculating) {
            System.out.print("Enter grams: ");
            float gram = keyboard.nextFloat();

            float ounces = (float) (gram * 28.3495231);

            System.out.println("Ounces: " + ounces);

            System.out.print("Press 'r' to calculate again or 'q' to quit: ");

            String input = keyboard.next();

            if (input.equalsIgnoreCase("r") || input.equalsIgnoreCase("R")) {
                continueCalculating = true;
            } else if (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("Q")) {
                continueCalculating = false;
            } else {
                System.out.println("Invalid input. Exiting the calculator.");
                continueCalculating = false;
            }
        }
        // prevent resources leak
        keyboard.close();
    }
}
