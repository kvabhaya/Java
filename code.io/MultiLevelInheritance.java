class MultiLevelInheritance {
    public static void main(String[] args) {
        Daughter d = new Daughter();
        System.out.println(d.gender);
        d.print();
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

class Daughter extends Mother {
    
}
