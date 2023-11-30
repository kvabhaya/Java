public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 5;
        int b= 0;
        try {
            System.out.println(a/b);
        }
        catch (ArithmeticException E) {
            //ArithmeticException is a class
            // E is a object
            System.out.println("b is 0");
        }
        System.out.println("Hello World!");
    }
}
