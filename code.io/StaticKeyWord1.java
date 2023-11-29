class StaticKeyWord1 {
    public static void main(String[] args) {
        Daughter d = new Daughter();
        System.out.println(d.gender);
        Father.print();
    }
}

class Father {
    char gender = 'M';
    static void print() {
        System.out.println("Parent Class");
    }
}

class Daughter extends Father {
    char gender = 'F';
}
