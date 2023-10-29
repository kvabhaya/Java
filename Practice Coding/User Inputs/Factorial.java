//Create a program that calculates the factorial of a number entered by the user.
import java.util.*;
public class Factorial {
    public static int calculateFactorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num <= 0)
            System.out.println("You Enterd a Negative Number");
        else {
            System.out.println(calculateFactorial(num));
        }
    }
}
