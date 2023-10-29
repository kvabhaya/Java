//Write a program that takes the user's name as input and greets them with "Hello, [Name]!".
import java.util.*;
public class Greet {
    public static void main(String[] args) {
        System.out.print("Enter Your Name : ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("Hello, "+str+"!");
    }
}
