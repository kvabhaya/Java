import java.util.*;
public class AccessModifire {
    private String name;
    private int num;

    public void setValue () {
        System.out.print("Enter Value For Name : ");
        Scanner getName1 = new Scanner(System.in);
        String str = getName1.nextLine();
        System.out.print("Enter Value For Number : ");
        Scanner getNum1 = new Scanner(System.in);
        int no = getNum1.nextInt();
        getValue(str, no);
    }
    public void getValue (String str, int no) {
//        System.out.println("Hi "+str+" Your Enroll Number is "+no);
        name = str;
        num = no;
        System.out.println("Hi "+name+" Your Enroll Number is "+num);
    }
}
class Access {
    public static void main(String[] args) {
        AccessModifire user1 = new AccessModifire();
        user1.setValue();
        user1.getValue("olong", 15320);
    }
}
