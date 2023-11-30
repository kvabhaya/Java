public class ExceptionHandling3throw {
    static void check(int age) {
        if (age<18) {
            throw new ArithmeticException("Age Invalid");
        }
    }
    public static void main(String[] args) {
        try {
            check(17);
        } catch (ArithmeticException E) {
            System.out.println(E.getMessage());
            //getMessage - to get message only
        }
        System.out.println("Hello");
    }
}
