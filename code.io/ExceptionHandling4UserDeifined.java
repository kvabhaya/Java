
class ExceptionHandling4UserDeifined extends Exception {
    String msg;
    ExceptionHandling4UserDeifined(String msg) {
        super(msg);
    }
}
class ExceptionHandling {
    static void check (int age) throws ExceptionHandling4UserDeifined, ArithmeticException{
        //throws - whole function error detecting
        if(age<18) {
            throw new ExceptionHandling4UserDeifined("Invalid");
        }
        else {
            throw new ArithmeticException("Valid");
        }
    }
    public static void main(String[] args) {
        try {
            check(19);
        }
        catch (ExceptionHandling4UserDeifined E) {
            System.out.println(E.getMessage());
        }
        catch (ArithmeticException E) {
            System.out.println(E.getMessage());
        }
    }
}
