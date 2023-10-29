public class RecursionThree {
    public static void main(String[] args) {
        int n = 3;
        int sum = sumOfNumber(n);
        System.out.println("Summation of Upto"+ n +" is " + sum );
    }

    public static int sumOfNumber(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return (n + sumOfNumber(n-1));
        }
    }
}
