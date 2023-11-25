public class HierarchicalInhertance {
    public static void main(String[] args) {
        Mother m = new Mother();
        System.out.println(m.gender);
        m.print();

        Uncle u = new Uncle();
        System.out.println(u.gender);
        u.print();
    }
}

class GrandFather {
    char gender = 'M';
    void print() {
        System.out.println("Parent Class");
    }
}

class Mother extends GrandFather {
    char gender = 'F';
}

class Uncle extends GrandFather {
}
