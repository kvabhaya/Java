public class PredefinedClasses1{
    //toString
    //toBinaryString
    //valueOf
    //parseInt
    public static void main(String[] args) {
        String s = Integer.toString(55);
        System.out.println(s);

        String d = Integer.toBinaryString(23);
        //toOctalString
        //toHexString
        System.out.println(d);

        int x = Integer.valueOf(d);
        //return Integer classe's object
        System.out.println(x);

        int y = Integer.parseInt(d);
        //return premetive data type int
        System.out.println(y);
    }
}
