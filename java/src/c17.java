import java.util.*;

public class c17 {
    private static Scanner input = new Scanner(System.in);
    private static boolean calculateAgain = true;

    public static void main(String[] args) {
        System.out.println("Go Question 1 press 1, Question 2 press 2, Question 3 press 3, Question 4 press 4");
        String inputs = input.next();

        if (inputs.equalsIgnoreCase("1")) {
            Question1();
        }
        if (inputs.equalsIgnoreCase("2")) {
            Question2();
        }
        if (inputs.equalsIgnoreCase("3")) {
            Question3();
        }
        if (inputs.equalsIgnoreCase("4")) {
            Question4();
        }
        // prevent resources leak
        input.close();
    }

    static void Question1() {

        System.out.println("Welcome to the online book club awards point system......");
        wait(1000);

        while (calculateAgain) {
            System.out.print("Please type how many book you been purchase this month : ");
            int i = input.nextInt();
            System.out.println("Loading[=---------]");
            wait(2000);
            System.out.println("Loading[====------]");
            wait(1000);
            System.out.println("Loading[========--]");
            wait(1000);
            System.out.println("Loading[=========-]");
            wait(3000);
            System.out.println("Loading[==========]");

            int pointsEarned;
            switch (i) {
                case 0:
                    System.out.println("Please don't troll, try again.");
                    break;
                case 1:
                    pointsEarned = 5;
                    System.out.println("You have purchase " + i + " books and you earn " + pointsEarned + " point");
                    break;

                case 2:
                    pointsEarned = 10;
                    System.out.println("You have purchase " + i + " books and you earn " + pointsEarned + " point");
                    break;

                case 3:
                    pointsEarned = 15;
                    System.out.println("You have purchase " + i + " books and you earn " + pointsEarned + " point");
                    break;

                default:
                    pointsEarned = 30;
                    System.out.println("You have purchase " + i + " books and you earn " + pointsEarned + " point");
                    break;
            }
            System.out.print("Calculate again? Press 'r' to continue or any other key to quit: ");
            String inputs = input.next();
            if (!inputs.equalsIgnoreCase("r")) {
                calculateAgain = false;
            }
        }
        input.close();
    }

    static void Question2() {
        System.out.println("Welcome to the retail discount system......");
        while (calculateAgain) {
            System.out.print("Please type how many unit you been purchase : ");
            int i = input.nextInt();

            int packageprice = 99;
            double total;
            System.out.println("The package is RM" + packageprice);
            if (i < 10) {
                System.out.println("You've bought " + i + " and discount rate is 0%");
                total = i * packageprice;
                System.out.println("Total is " + total);
            }
            if (i >= 40) {
                double x = 0.5;
                double discountedpackage = (packageprice * x);
                System.out.println("You've bought " + i + " and discount rate is 50%");
                total = i * (packageprice - discountedpackage);
                System.out.println("Total is " + total);
            } else if (i >= 30) {
                double x = 0.4;
                double discountedpackage = (packageprice * x);
                System.out.println("You've bought " + i + " and discount rate is 40%");
                total = i * (packageprice - discountedpackage);
                System.out.println("Total is " + total);
            } else if (i >= 20) {
                double x = 0.3;
                double discountedpackage = (packageprice * x);
                System.out.println("You've bought " + i + " and discount rate is 30%");
                total = i * (packageprice - discountedpackage);
                System.out.println("Total is " + total);
            } else if (i >= 10) {
                double x = 0.2;
                double discountedpackage = (packageprice * x);
                System.out.println("You've bought " + i + " and discount rate is 20%");
                total = i * (packageprice - discountedpackage);
                System.out.println("Total is " + total);
            } else if (i < 10) {
                System.out.println("You've bought " + i + " and discount rate is 0%");
                total = i * packageprice;
                System.out.println("Total is " + total);
            }
            System.out.print("Calculate again? Press 'r' to continue or any other key to quit: ");
            String inputs = input.next();
            if (!inputs.equalsIgnoreCase("r")) {
                calculateAgain = false;
            } //
        }
        input.close();
    }

    static void Question3() {
        System.out.println("Race Results");

        System.out.print("What is first person name : ");
        String firstP = input.next();
        System.out.print("What is first person speed : ");
        int firstS = input.nextInt();
        System.out.print("What is second person name : ");
        String secondP = input.next();
        System.out.print("What is second person speed : ");
        int secondS = input.nextInt();
        System.out.print("What is third person name : ");
        String thirdP = input.next();
        System.out.print("What is third person speed : ");
        int thirdS = input.nextInt();
        int time = 10;
        float distantfirst = firstS / time;
        float distantsecond = secondS / time;
        float distantthird = thirdS / time;

        String firstPlace, secondPlace, thirdPlace;
        if (distantfirst < distantsecond && distantfirst < distantthird) {
            firstPlace = firstP;
            if (distantsecond < distantthird) {
                secondPlace = secondP;
                thirdPlace = thirdP;
            } else {
                secondPlace = thirdP;
                thirdPlace = secondP;
            }
        } else if (distantsecond < distantfirst && distantsecond < distantthird) {
            firstPlace = secondP;
            if (distantfirst < distantthird) {
                secondPlace = firstP;
                thirdPlace = thirdP;
            } else {
                secondPlace = thirdP;
                thirdPlace = firstP;
            }
        } else {
            firstPlace = thirdP;
            if (distantfirst < distantsecond) {
                secondPlace = firstP;
                thirdPlace = secondP;
            } else {
                secondPlace = secondP;
                thirdPlace = firstP;
            }
        }
        // Display the results
        System.out.println("First place: " + firstPlace);
        System.out.println("Second place: " + secondPlace);
        System.out.println("Third place: " + thirdPlace);

        input.close();
    }

    static void Question4() {
        System.out.println("Enter the size of the diamond");
        int rows = input.nextInt();

        // Upper half of the diamond pattern
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print plus signs
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("+");
            }

            System.out.println();
        }
        // Lower half of the diamond pattern
        for (int i = rows - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print plus signs
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("+");
            }

            System.out.println();
        }
        input.close();
    }

    // wait function
    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
