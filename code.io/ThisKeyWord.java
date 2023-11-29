public class ThisKeyWord {
    public static void main(String[] args) {
        Father f = new Father();
        f.print('M', 50);
        System.out.println(f.gender);
        System.out.println(f.age);
    }
}

class Father {
    char gender;
    int age;
    void print(char gender, int age) {
        //System.out.println("Parent Class");
        this.gender = gender;
        //this - Father class's instant variable
        this.age = age;
    }
}

class Son extends Father {
    char gender;
    void print() {
        
    }
}
