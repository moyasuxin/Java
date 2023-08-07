import java.util.*;

public class c20 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(
                "Press 1 for Q1, Press 2 for Q2, Press 3 for Q3");
        String inputs = input.next();
        if (inputs.equalsIgnoreCase("1")) {
            Q1();
        } else if (inputs.equalsIgnoreCase("2")) {
            Q2();
        } else if (inputs.equalsIgnoreCase("3")) {
            Q3();
        }
    }

    static void Q1() {
        int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Display first to last");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println("");
        System.out.println("Display last to first");
        for (int j = num.length - 1; j >= 0; j--) {
            System.out.print(num[j] + " ");
        }
    }

    static void Q2() {
        int[] employeeIds = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        String[] employeeNames = { "John", "John2", "John3", "John4", "John5", "John6", "John7", "John8", "John9",
                "John10" };
        System.out.print("Enter an employee ID: ");
        int searchId = input.nextInt();

        int index = findEmployeeIndex(employeeIds, searchId);

        if (index != -1) {
            String employeeName = employeeNames[index];
            System.out.println("Employee name for ID : " + searchId + "\n Name: " + employeeName);
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }

        input.close();
    }

    static int findEmployeeIndex(int[] ids, int searchId) {
        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == searchId) {
                return i;
            }
        }
        return -1; // ID not found
    }

    static void Q3() {
        System.out.println("Enter your array size:");
        int SIZE = input.nextInt();
        double[] numbers = new double[SIZE];
        // Get input from the user for 10 double values
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter value array number " + (i + 1) + ": ");
            numbers[i] = input.nextDouble();
        }
        // Calculate the average, smallest, and largest numbers
        double sum = 0;
        double smallest = numbers[0];
        double largest = numbers[0];

        for (int i = 0; i < SIZE; i++) {
            sum += numbers[i];

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }

            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        double average = sum / SIZE;

        // Display the results
        System.out.println("Average: " + average);
        System.out.println("Smallest Number: " + smallest);
        System.out.println("Largest Number: " + largest);

    }
}
