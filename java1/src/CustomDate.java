import java.time.LocalDate;

public class CustomDate {
    private int day;
    private int month;
    private int year;

    /*
     * %: This is the placeholder for the value that will be replaced during
     * formatting.
     * 0: This is the flag that tells the formatter to pad the number with leading
     * zeros.
     * 4: This is the width specifier, which specifies the minimum width of the
     * formatted
     * output. In this case, it ensures that the number has at least 4 characters.
     * If the number has fewer than 4 digits, it will be padded with leading zeros
     * to meet the width requirement.
     * d: This is the conversion character for an integer (decimal) value.
     */
    /*
     * That means
     * let variable become int
     * instead of System.out.print(variable1 + " string " + variable2);
     * we can make it
     * System.out.print("%d string %d ", variable1 , variable2);
     */

    public CustomDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public CustomDate(String month, int day, int year) {
        this.day = day;
        this.year = year;
        this.month = getMonthNumber(month);
    }

    public CustomDate(int dayOfYear, int year) {
        this.year = year;
        calculateDateFromDayOfYear(dayOfYear);
    }

    // Helper method to calculate the month and day from day of the year
    private void calculateDateFromDayOfYear(int dayOfYear) {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int month = 1;

        for (int i = 0; i < daysInMonth.length; i++) {
            if (dayOfYear <= daysInMonth[i]) {
                month = i + 1;
                break;
            }
            dayOfYear -= daysInMonth[i];
        }

        this.month = month;
        this.day = dayOfYear;
    }

    // Helper method to get month number from month name
    private int getMonthNumber(String monthName) {
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };

        for (int i = 0; i < months.length; i++) {
            if (months[i].equalsIgnoreCase(monthName)) {
                return i + 1;
            }
        }

        return -1; // Invalid month name
    }

    // Output the date in MM/DD/YYYY format
    public void printDateMMDDYYYY() {
        System.out.printf("%02d / %02d / %04d %n", month, day, year);
    }

    // Output the date in Month DD, YYYY format
    public void printDateMonthDDYYYY() {
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        System.out.printf("%s %02d, %04d %n", months[month - 1], day, year);
    }

    // Output the date in DDD YYYY format
    public void printDateDDDYYYY() {
        int dayOfYear = calculateDayOfYear();
        System.out.printf(dayOfYear + " days & " + year + " years %n");
    }

    // Helper method to calculate the day of the year
    private int calculateDayOfYear() {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int dayOfYear = day;

        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }

        if (isLeapYear(year) && month > 2) {
            dayOfYear++;
        }

        return dayOfYear;
    }

    // Helper method to check if it's a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        // Create CustomDate objects with the current date
        LocalDate currentDate = LocalDate.now();

        // CustomDate with three integer values (MM/DD/YYYY format)
        CustomDate date1 = new CustomDate(currentDate.getMonthValue(), currentDate.getDayOfMonth(),
                currentDate.getYear());
        date1.printDateMMDDYYYY();

        // CustomDate with a String and two integer values (Month DD, YYYY format)
        CustomDate date2 = new CustomDate(currentDate.getMonth().name(), currentDate.getDayOfMonth(),
                currentDate.getYear());
        date2.printDateMonthDDYYYY();

        // CustomDate with two integer values (DDD YYYY format)
        CustomDate date3 = new CustomDate(currentDate.getDayOfYear(), currentDate.getYear());
        date3.printDateDDDYYYY();
    }
}
