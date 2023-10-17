import java.util.*;
public class GradedMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Mark : ");

        int mark = scanner.nextInt();

        if (mark>=80 && mark<=100) {
            System.out.println("A");
        }
    }
}
