import java.util.Scanner;

public class c3 {
    public static void main(String[] args) {
        int n, c;
        System.out.println("Enter  an  integer  :  ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("Multiplication  of  " + n + "  is  :");
        in.close();
        for (c = 1; c <= 10; c++) {
            System.out.println(n + "*" + c + " = " + (n * c));
        }
    }
}
