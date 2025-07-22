import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int m = s.nextInt();
        int sum = n + m;
        int st = 0;
        
        while (true) {
            boolean isPrime = true;

            if (sum <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(sum); i++) {
                    if (sum % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                break;
            } else {
                sum++;
                st++;
            }
        }
        System.out.println(st);
        System.out.println(sum);
    }
}
