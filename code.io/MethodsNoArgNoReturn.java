public class MethodsNoArgNoReturn {
    public static void main(String args[]){
        add();
        System.out.println("c printed");
    }

    public static void add(){
        int a=10;
        int b=15;
        int c=a+b;
        System.out.println(c);
    }
}
