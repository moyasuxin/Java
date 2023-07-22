
//This program calculates the total price which includes VAT
import java.util.Scanner;

public class c5 {

    public static void main(String[] args) {

        // identifier declarations
        final double VAT = 0.15;
        double price;
        double tax;
        double total;
        String item;

        // create a Scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // display prompts and get input
        System.out.print("Item description: ");
        item = keyboard.nextLine();

        System.out.print("Item price: $");
        price = keyboard.nextDouble();

        keyboard.close();
        // calculations
        tax = price * VAT;
        total = price + tax;

        // display results
        System.out.print(item + " $");
        System.out.println(price);
        System.out.print("Tax $");
        System.out.println(tax);
        System.out.print("Total $");
        System.out.println(total);
    }
}
