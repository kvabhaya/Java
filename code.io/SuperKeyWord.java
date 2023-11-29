public class SuperKeyWord {
    public static void main(String[] args) {
        Father f = new Father();
        System.out.println(f.gender);

        Daughter d = new Daughter();
        d.print();
    }
}

class Father {
    char gender = 'M';
    void print() {
        System.out.println("Parent Class");
    }
}

class Daughter extends Father {
    char gender = 'F';
    void print() {
        super.print();
        System.out.println(super.gender);//will output parent class gender
        
    }
}
