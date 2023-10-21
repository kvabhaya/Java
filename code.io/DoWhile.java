public class DoWhile {
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;
        int n = 5;

        do {
            sum = sum + i;
            i++;
        }
        while (i <= n);
        System.out.println(sum);
    }
}
