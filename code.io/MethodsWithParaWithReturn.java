public class MethodsWithParaWithReturn {
    public static void main(String[] args) {
        int result = add(10,15);
        result = result*10;
        System.out.println(result);
        System.out.println("c printed");

    }
    public static int add(int a,int b){
        int c = a+b;
        return c;
    }
}
