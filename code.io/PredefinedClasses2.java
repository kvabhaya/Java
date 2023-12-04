public class PredefinedClasses2 {
    public static void main(String[] args) {
        String s = "Hello World!";
        System.out.println(s.equals("Hello World!"));

        System.out.println(s.charAt(1));

        char[] arr = s.toCharArray();
        System.out.println(arr[2]);

        String d = "5.99999";
        System.out.println(Double.parseDouble(d));
    }
}
