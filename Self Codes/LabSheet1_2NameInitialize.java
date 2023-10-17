import java.util.*;
public class LabSheet1_1NameInitialize {
    public static void main(String[] args) {
        // First Name
        Scanner fName = new Scanner(System.in);
        System.out.println("Enter a First Name");
        String firstName = fName.nextLine();

        //Middle Name
        Scanner mName = new Scanner(System.in);
        System.out.println("Enter a Middle Name");
        String middleName = mName.nextLine();

        //Last Name
        Scanner lName = new Scanner(System.in);
        System.out.println("Enter a Last Name");
        String lastName = lName.nextLine();

        System.out.println(lastName+", "+firstName+" "+middleName.substring(0,1)+".");

    }
}
