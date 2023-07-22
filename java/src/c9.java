import java.util.*;

public class c9 {
    public static void main(String[] args) {
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("/////////Welcome to Sales Tax System///////////");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        // create a Scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // enter vat
        float VAT;
        System.out.print("  What's your VAT : ");
        VAT = keyboard.nextFloat();

        // enter the product quantity
        float quantity;
        System.out.print("  Enter how much you want to buy : ");
        quantity = keyboard.nextFloat();
        // enter desc
        String item;
        System.out.print("  Enter your item description : ");
        item = keyboard.next();

        // enter original price
        float price;
        System.out.print("  Enter your product price : ");
        price = keyboard.nextFloat();

        // enter vat
        float pricesell;
        System.out.print("  What's your selling price : ");
        pricesell = keyboard.nextFloat();

        // enter vat
        int num111;
        System.out.print("  What's your number : ");
        num111 = keyboard.nextInt();

        // calculate
        float tax = pricesell * VAT;
        float markupPercentage = ((pricesell - price) / price) * 100;
        float total = (pricesell * quantity) + tax;

        // print
        System.out.println("----------" + item + "--" + price + " $");
        System.out.println("----------Selling Price : " + pricesell + " $");
        System.out.println("----------Quantity" + quantity);
        System.out.println("----------Tax : " + tax + " $");
        System.out.println("----------Include Tax : " + total + " $");
        System.out.println("----------Markup Percentage : " + markupPercentage + " %");
        System.out.println("----------" + num111);
        System.out.println("                                   ");

        // fancy
        Heart();
        // prevent resources leak
        keyboard.close();
    }

    static void Heart() {
        System.out.println("    ***     ***      ");
        System.out.println("   *****   *****     ");
        System.out.println("  ******* *******    ");
        System.out.println(" *****************   ");
        System.out.println("*******************  ");
        System.out.println(" *****************  ");
        System.out.println("  ***************   ");
        System.out.println("   *************    ");
        System.out.println("    ***********     ");
        System.out.println("      *******       ");
        System.out.println("        ***         ");
        System.out.println("         *          ");
    }
}
