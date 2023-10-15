public class AppForm {
    String name;
    int rollno;

    public void display() {
        System.out.println(name);
        System.out.println(rollno);
    }

    public static void main(String[] args) {
        AppForm olong = new AppForm();//AppForm() is a constructor

        //members of olong object
        olong.name = "Kokila Abhayasundara";
        olong.rollno = 1000;
        olong.display();
    }
}
