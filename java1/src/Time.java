import java.time.Instant;

public class Time {
    private int hour;
    private int minute;
    private int second;

    // No-arg constructor for current time
    public Time() {
        Instant instant = Instant.now(); // Get the current timestamp
        long millis = instant.toEpochMilli(); // Convert to milliseconds
        setTime(millis); // Set the time using the millis value
    }

    // Constructor with elapsed time in milliseconds since January 1, 1970
    public Time(long millis) {
        setTime(millis); // Set the time using the provided millis value
    }

    // Private helper method to set the time based on elapsed time in milliseconds
    private void setTime(long millis) {
        // Calculate the total seconds from milliseconds
        long totalSeconds = millis / 1000;

        // Calculate the seconds within the current minute
        this.second = (int) (totalSeconds % 60);

        // Calculate the total minutes
        long totalMinutes = totalSeconds / 60;

        // Calculate the minutes within the current hour
        this.minute = (int) (totalMinutes % 60);

        // Calculate the total hours
        long totalHours = totalMinutes / 60;

        // Calculate the hours since midnight
        this.hour = (int) (totalHours % 24);
    }

    // Getter methods for hour, minute, and second
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public static void main(String[] args) {
        // Create two Time objects
        Time time1 = new Time(); // For current time
        Time time2 = new Time(555550000); // For specified elapsed time

        // Display the time using the getter methods
        System.out.printf(
                "Time 1 (Current Time): %d : %d : %d %n", time1.getHour(), time1.getMinute(), time1.getSecond());
        System.out.println(
                "Time 1 (Current Time): " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());

        System.out.printf(
                "Time 2 (Current Time): %d : %d : %d %n", time2.getHour(), time2.getMinute(), time2.getSecond());
        System.out.println(
                "Time 2 (Elapsed Time): " + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
    }
}
