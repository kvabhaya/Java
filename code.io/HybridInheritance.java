public class HybridInheritance {
    public static void main(String[] args) {
        Daughter d = new Daughter();
        System.out.println(d.gender);
        d.print();

        GrandDaughter g = new GrandDaughter();
        System.out.println(g.gender);
        g.print();

        
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
}

class Son extends Father {

}

class GrandDaughter extends Daughter {
    void print() {
        System.out.println("GrandDaughter");
    }
}
