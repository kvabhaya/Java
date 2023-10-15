public class MethodsWithParaNoReturn {
    public static void main(String[] args) {
        add(10,15);
        System.out.println("c printed");
    }
    public static void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
}
