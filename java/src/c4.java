import java.util.*;

public class c4 {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter  first  integer  want  to  sum  :  ");
        x = kb.nextInt();
        System.out.print("Enter  second  integer  want  to  sum  :  ");
        y = kb.nextInt();
        sum = x + y;
        System.out.println("The  integer  you  enter  are  " + x + "  +  " + y + "  =  " + sum);
        kb.close();
    }
}