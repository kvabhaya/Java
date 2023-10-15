// import java.util.*;
public class Object2ApplForm {
    String name;
    int rollno;

    public void display() {
        System.out.println(name);
        System.out.println(rollno);
    }

    public void setValues(String getName, int getRollNo) {
        name = getName;
        rollno = getRollNo;
    }

}
class Main {
    public static void main(String[] args) {
        ApplForm olong = new ApplForm();
        olong.setValues("Kokila Abhayasundara",1000);
        olong.display();

        ApplForm user = new ApplForm();
        user.name = "Maduja Abhayasundara";
        user.rollno = 1001;
        user.display();


    }

}
