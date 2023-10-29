public class RecursionTwo {
    public static void main(String[] args) {
        int n = 5;
        long factorial = factorialNum(n);
        System.out.println(factorial);
    }

    public static int factorialNum(int n) {
        if (n >= 1) {
            return n * factorialNum(n-1);
        }
        else {
            return 1;
        }
    }
}
