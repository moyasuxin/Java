import java.util.*;

public class c8 {
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

        if (i == ii) {
            equal();
        } else {
            notEqual(i, ii);
        }
        // prevent resources leak
        keyboard.close();

        // another way expect it output the same way
        String result = (i == ii) ? "Number is equal"
                : ((i > ii) ? "First float is bigger than second" : "Second float is bigger than first");
        // print result
        System.out.println(result);
    }

    static void equal() {
        System.out.println("Number is equal");
    }

    static void notEqual(float i, float ii) {
        if (i > ii) {
            System.out.println("First float is bigger than second");
        } else {
            System.out.println("Second float is bigger than first");
        }
    }
}
