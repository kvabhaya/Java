import java.util.Scanner;

public class DigitsInNumber { 
    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        
        int count = 0;
        while (number > 0) {
            count++;
            number = number/10;
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer: ");
            int input = scanner.nextInt();

            if (input < 0) {
                System.out.println("Terminated.");
                break;
            } else {
                int digitCount = countDigits(input);
                System.out.println("Number of digits: " + digitCount);
            }
        }

        scanner.close();
    }
}
