
import java.util.*;

public class Returning_Carry_Count_Sub {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        int borrow = 0;
        int bcount = 0;

        while (n1 > 0 || n2 > 0 ) {
            int l1 = n1 % 10;
            int l2 = n2 % 10;


            if (l2>l1) {
                borrow = 1;
                bcount++;
            } else {
                borrow = 0;
            }

            n1 /= 10;
            n2 /= 10;
        }

        System.out.println("Total borrow: " + bcount);
    }
}
