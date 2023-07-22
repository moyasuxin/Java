import java.util.*;

public class c7 {
    public static void main(String[] args) {
        // define
        float i, ii;
        // create a Scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // display prompts and get input
        System.out.print("Enter First Integer: ");
        i = keyboard.nextFloat();

        System.out.print("Enter Second Integer: ");
        ii = keyboard.nextFloat();

        // define output
        float sum, different, product, quotient;

        // calculate
        sum = i + ii;
        different = i - ii;
        product = i * ii;
        quotient = i / ii;
        // Print
        System.out.println("Sum = " + sum);
        System.out.println("Different = " + different);
        System.out.println("Product = " + product);
        System.out.println("Quotient = " + quotient);

        // prevent resources leak
        keyboard.close();
    }
}
