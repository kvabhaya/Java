import java.util.*;
public class LabSheet1_1MiddleCharacter {
    public static void main(String[] args) {
        Scanner myWord = new Scanner(System.in);
        System.out.println("Enter a Word");
        String oddWord = myWord.nextLine();  // Read user input
        if (oddWord.length() % 2 == 1) {
            int middleIndex = oddWord.length() / 2;
            char middleChar = oddWord.charAt(middleIndex);
            System.out.println("The middle character is: " + middleChar);
        } else {
            System.out.println("Please enter an odd-length word.");
        }

    }
}
