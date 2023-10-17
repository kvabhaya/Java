import java.util.*;
public class LabSheet1_3LengthConverter {
    public static void main(String[] args) {
        Scanner cmlength = new Scanner(System.in);
        System.out.println("Enter a Length in cm");
        float cm = cmlength.nextFloat();

        //cm inches
        float inch = cm / 2.54f;

        //cm to feet
        float feet = inch / 12;
        
        System.out.println("Inches : "+inch);
    
        System.out.println("Feets : "+feet);

    }
}
