public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int n = arr.length;
        int sum = 0;

        for (int i=0;i<n-1;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);

    }
}
