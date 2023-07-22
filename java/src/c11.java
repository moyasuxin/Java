public class c11 {
    public static void main(String[] args) {
        // Working hours in minutes
        int startHour = 8;
        int startMinute = 12;
        int endHour = 16;
        int endMinute = 38;
        int lunchStartHour = 12;
        int lunchStartMinute = 2;
        int lunchEndHour = 12;
        int lunchEndMinute = 24;

        // Convert hours and minutes to total minutes
        int startTime = startHour * 60 + startMinute;
        int endTime = endHour * 60 + endMinute;
        int lunchStartTime = lunchStartHour * 60 + lunchStartMinute;
        int lunchEndTime = lunchEndHour * 60 + lunchEndMinute;

        // Calculate total working duration
        int workingDuration = endTime - startTime - (lunchEndTime - lunchStartTime);

        // Convert working duration to hours and minutes
        int workingHours = workingDuration / 60;
        int workingMinutes = workingDuration % 60;

        // Display the result
        System.out.println(
                "Jimmy worked for " + workingHours + " hours and " + workingMinutes + " minutes on Wednesday.");

    }
}
