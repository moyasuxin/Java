import java.util.*;

public class c12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        float speedMe;
        float speedJill;

        System.out.print("What is your speed : ");
        speedMe = keyboard.nextFloat();

        System.out.print("What is Jill speed : ");
        speedJill = keyboard.nextFloat();

        System.out.print("Enter the duration of the race (minutes): ");
        float time = keyboard.nextFloat();

        float distanceMe = speedMe * time;
        float distanceJill = speedJill * time;

        System.out.println("Your boat traveled a distance of " + distanceMe + " feet.");
        System.out.println("Jill's boat traveled a distance of " + distanceJill + " feet.");
        // prevent resources leak
        keyboard.close();
    }
}
