public class FinalKeyWord {
    public static void main(String[] args) {
        Father f = new Father();
        System.out.println(f.gender);

        Daughter d = new Daughter();
        System.out.println(d.gender);
    }
    
}

class Father {
    final char gender = 'M'; //can not change
    int age = 50;
    final void print() {
        System.out.println("Parent Class");
    } //Can not override
}

class Daughter extends Father {
    
} 
