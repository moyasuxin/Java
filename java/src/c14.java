import java.util.*;

public class c14 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Beginning meter reading : ");
        int m1 = keyboard.nextInt();
        System.out.print("Enter Ending meter reading : ");
        int m2 = keyboard.nextInt();

        int total = m2 - m1;
        int price = total * 10;
        price /= 100;

        System.out.print("Total price are : RM" + price);
        // prevent resources leak
        keyboard.close();
    }
}
