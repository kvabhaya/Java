public class ExceptionHandling2Finally {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        try {
            System.out.println(a/b);
        }
        catch (Exception E) {
            System.out.println("b is 0");
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("Hello");
    }
}
