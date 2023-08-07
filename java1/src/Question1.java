import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Question1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(
                "If you want to set current date (IRL) as format press 1, if you want a custom date as format press 2");
        String inputs = input.next();
        if (inputs.equalsIgnoreCase("1")) {
            method1();
        } else if (inputs.equalsIgnoreCase("2")) {
            method2(input); // Pass the Scanner object to method2
        } else {
            System.out.println("Invalid input. Please try again.");
        }
    }

    static void method1() {
        LocalDate currentDate = LocalDate.now();

        // Format 1: MM / DD / YYYY
        String format1 = currentDate.format(DateTimeFormatter.ofPattern("MM / dd / yyyy"));
        System.out.println("Format 1: " + format1);

        // Format 2: Month DD, YYYY
        String format2 = currentDate.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy"));
        System.out.println("Format 2: " + format2);

        // Format 3: DDD YYYY
        String format3 = currentDate.format(DateTimeFormatter.ofPattern("DDD"));
        String format3_5 = currentDate.format(DateTimeFormatter.ofPattern("yyyy"));
        System.out.println("Format 3: " + format3 + "days " + format3_5);
    }

    static void method2(Scanner input) {
        System.out.println("Enter the date in the format MM DD YYYY (separated by spaces):");
        int month = input.nextInt();
        int day = input.nextInt();
        int year = input.nextInt();

        input.nextLine(); // Consume the leftover line separator
        // Create a LocalDate object from the custom date inputs
        LocalDate customDate = LocalDate.of(year, month, day);

        // Format 1: MM / DD / YYYY
        String format1 = customDate.format(DateTimeFormatter.ofPattern("MM / dd / yyyy"));
        System.out.println("Format 1: " + format1);

        // Format 2: Month DD, YYYY
        String format2 = customDate.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy"));
        System.out.println("Format 2: " + format2);

        // Format 3: DDD YYYY
        String format3 = customDate.format(DateTimeFormatter.ofPattern("DDD"));
        String format3_5 = customDate.format(DateTimeFormatter.ofPattern("yyyy"));
        System.out.println("Format 3: " + format3 + "days " + format3_5);
    }
}
