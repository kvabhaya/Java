public class Variables {
    public static void main(String[] args) {
        String name = "John";
        System.out.println(name);

        int i = 5;
        System.out.println(i);

        int myNum;
        myNum = 20;
        System.out.println(myNum);

        final int x = 15;
        int x = 20;
        System.out.println(x);
        // will generate an error: cannot assign a value to a final variable
    }
}
