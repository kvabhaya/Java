public class Constructor {
    int rollNumber;
    int marks;

    Constructor(int rollNum, int mark) {
        rollNumber = rollNum;
        marks = mark;
    }
}

class Sample {
    public static void main(String[] args) {
        Constructor object = new Constructor(1000, 20);
        System.out.println(object.rollNumber);
        System.out.println(object.marks);
    }
}
