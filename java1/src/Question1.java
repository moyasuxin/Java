import java.time.*;
import java.time.format.DateTimeFormatter;

public class Question1 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        // Format 1: MM / DD / YYYY
        String format1 = currentDate.format(DateTimeFormatter.ofPattern("MM / dd / yyyy"));
        System.out.println("Format 1: " + format1);

        // Format 2: Month DD, YYYY
        String format2 = currentDate.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy"));
        System.out.println("Format 2: " + format2);

        // Format 3: DDD YYYY
        String format3 = currentDate.format(DateTimeFormatter.ofPattern("DDD yyyy"));
        System.out.println("Format 3: " + format3);

    }

}
