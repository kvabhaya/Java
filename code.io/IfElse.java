public class IfElse {
    public static void main(String[] args) {
        char attendence = 'A';

        if (attendence == 'P') {
            System.out.println("Present");
        }
        else if (attendence == 'A') {
            System.out.println("Absent");
        }
        else {
            System.out.println("On Duty");
        }
    }
}
