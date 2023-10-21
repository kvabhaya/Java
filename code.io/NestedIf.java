public class NestedIf {
    public static void main(String[] args) {
        char attendence = 'P';
        int total = 40;

        if (attendence == 'P') {
            if (total >= 50){
                System.out.println("Present - Can Attend");
            }
            else if (total >= 30) {
                System.out.println("Present - Low Attendece");
            }
            else {
                System.out.println("Present - Can not Attend");
            }
        }
        else if (attendence == 'A') {
            System.out.println("Absent");
        }
        else {
            System.out.println("On Duty");
        }
    }
}
