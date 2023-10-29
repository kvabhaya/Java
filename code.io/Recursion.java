public class Recursion {
    public static void main(String[] args) {
        numberPrint(10);
    }

    public static void numberPrint(int n) {
        //BaseCase
        if(n==1) {
            System.out.println(1);
        }
        //RecursiveCase
        else {
            System.out.println(n);
            numberPrint(n-1);
        }
    }
}
