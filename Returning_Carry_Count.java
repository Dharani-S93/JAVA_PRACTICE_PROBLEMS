/*  
     1----carry
     7 2 
     8 8
     ----
 (1)  6 0
 
 TO RETURN THE NUMBER OF CARRYS IN THE ADDITON
*/
import java.util.*;

public class Returning_Carry_Count {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        int carry = 0;
        int carryCount = 0;

        while (n1 > 0 || n2 > 0) {
            int l1 = n1 % 10;
            int l2 = n2 % 10;

            int sum = l1 + l2 + carry;

            if (sum >= 10) {
                carry = 1;
                carryCount++;
            } else {
                carry = 0;
            }

            n1 /= 10;
            n2 /= 10;
        }

        System.out.println("Total carry: " + carryCount);
    }
}
