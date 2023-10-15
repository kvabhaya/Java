import java. util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fname;
        String mname;
        String lname;
        System.out.print("Enter your First Name: ");
        fname = scanner.nextLine();
        System.out.print("Enter your Middle Name: ");
        mname = scanner.nextLine();
        System.out.print("Enter your Last Name: ");
        lname = scanner.nextLine();
        System.out.println(fname.substring(0,1)+"."+mname.substring(0,1)+"."+lname);

    }
}
