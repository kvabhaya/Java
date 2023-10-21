public class Array {
    public static void main(String[] args) {
        int[] rollno = new int[50];
        // rollno[0] = 1;
        // rollno[5] = 6;

        // System.out.println(rollno[5]);

        for (int i=0;i<50;i++) {
            rollno[i] = i+1;
        }
        for (int i=0;i<50;i++) {
            System.out.println(rollno[i]);
        }
    }
}
