//Implement a program that reads a series of numbers from the user until they enter a specific sentinel value, and then computes the sum of all the entered numbers.
import java.util.*;
public class CalculateSum {
    public static void main(String[] args) {
        int sum=0;
        int i =1;
        while (i>=0) {
            System.out.print("Enter a Number : ");
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            if (a==-1) {
                System.out.println("Terminated");
                break;
            }
            else {
                sum = sum + a;
            }
            i++;
        }
        System.out.println("Total is : "+sum);
    }
}
