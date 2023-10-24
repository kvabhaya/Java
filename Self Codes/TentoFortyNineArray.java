public class TentoFortyNineArray {
    public static void main(String[] args) {
        // int[][] arr = new int[4][10];
        int n=10;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j< 10;j++ ) {
                if ( n < 50) {
                    System.out.print(n+" ");
                    n++;
                }
                else{
                    break;
                }
            }
            System.out.println();
        }
    }
}
