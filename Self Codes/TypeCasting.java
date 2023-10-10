public class TypeCasting {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
    
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        double myDouble2 = 8.8;
        int myInt2 = (int) myDouble2; // Automatic casting: double to int

        System.out.println(myDouble2);  //Outputs 8.8
        System.out.println(myInt2);     //Outputs 8
    }
}
