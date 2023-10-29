//Create a method that takes a string as input and returns the length of the string.
import java.util.*;
public class StringLength {

    public static void getLength(String name) {
        System.out.println(name.length());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        getLength(name);
    }
}
