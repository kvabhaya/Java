class StaticKeyWordToVariable {
    public static void main(String[] args) {
        
        Daughter.age = 18;
        System.out.println(Father.age); //output will 18
        Father.print();
    }
}

class Father {
    static char gender = 'M'; 
    static int age = 50; //by using static to variable, assign same memory location to father age and daughter age
    static void print() {
        System.out.println("Parent Class");
    }
}

class Daughter extends Father {
    char gender = 'F';
}

