//Define a method that checks if a given number is prime or not.
import java.util.*;
public class PrimeOrNot {
    public static int checkPrime(int n) {
        if (n <= 1) {
            System.out.println("Not Prime");
            return -1;
        }
        if (n <= 3) {
            System.out.println("Prime");
            return 1;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            System.out.println("Not Prime");
            return -1;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                System.out.println("Not Prime");
                return -1;
            }
        }

        System.out.println("Prime");
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("Enter a Number ");
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        checkPrime(n);
    }

}
