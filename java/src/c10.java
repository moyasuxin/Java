import java.util.*;

public class c10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String stud_name;
        System.out.print("  Enter Student name : ");
        stud_name = keyboard.nextLine();

        System.out.print("  Enter Student email : ");
        String stud_email = keyboard.next();

        System.out.print("  Enter Student Total Marks : ");
        int mark = keyboard.nextInt();

        System.out.println("----------Student Name : " + stud_name);
        System.out.println("----------Student Email : " + stud_email);
        System.out.println("----------Student Name : " + stud_name);
        System.out.println("----------Student Marks : " + mark);

        // prevent resources leak
        keyboard.close();
        Heart();
    }

    static void Heart() {
        System.out.println("    ***     ***      ");
        System.out.println("   *****   *****     ");
        System.out.println("  ******* *******    ");
        System.out.println(" *****************   ");
        System.out.println("*******************  ");
        System.out.println(" *****************  ");
        System.out.println("  ***************   ");
        System.out.println("   *************    ");
        System.out.println("    ***********     ");
        System.out.println("      *******       ");
        System.out.println("        ***         ");
        System.out.println("         *          ");
    }
}
