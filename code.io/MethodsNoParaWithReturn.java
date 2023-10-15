public class MethodsNoParaWithReturn {
    public static void main(String[] args) {
        int result = add();
        result = result*5;
        System.out.println(result);
    }

    public static int add(){
        int a = 10;
        int b = 15;
        int c = a+b;
        return c;
    }
}
