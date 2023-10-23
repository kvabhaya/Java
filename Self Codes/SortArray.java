public class SortArray {
    public static void main(String[] args) {
        int[] sort = {1789, 2035, 1899, 1456, 2013};
        int n = sort.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sort[j] > sort[j + 1]) {
                    // Swap the elements
                    int temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                }
            }
        }
        
        for(int i=0;i<5;i++){
            System.out.println(sort[i]);
        }
    }
}
