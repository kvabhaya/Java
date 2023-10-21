public class ForLoop {
    public static void main(String[] args) {
        for (int i=0;i<100;i++) {
            System.out.print("Olong\t");
        }

        int sum = 0;
        for (int j=0;j<5;j++) {
            sum = sum + j;
            System.out.println("\n"+sum);
        }
    }
}
