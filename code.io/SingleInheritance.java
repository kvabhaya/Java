class SingleInheritance {
    public static void main(String[] args) {
        Son s = new Son();
        System.out.println(s.gender);
        s.print();
    }
}

class Father {
    char gender = 'M';
    void print() {
        System.out.println("Parent Class");
    }
}

class Son extends Father {

}
