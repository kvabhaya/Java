//Write a method that reverses a given string.
import java.util.*;
public class ReverseString {
    public static void stringRevers(String str) {
        for (int i=str.length();i>0;i--) {
            System.out.print(str.charAt(i - 1));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String str = input.nextLine();
        System.out.println(str);
        stringRevers(str);
    }
}
