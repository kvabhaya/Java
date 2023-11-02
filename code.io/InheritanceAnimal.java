public class InheritanceAnimal {
    int noLegs = 4;

    public static void eat() {
        System.out.println("I am eating");
    }

    public static void walk() {
        System.out.println("I am Walking");
    }
}
class Dog extends InheritanceAnimal { //inheritance
    Boolean canBark = true;
}

class Cat extends InheritanceAnimal {

}

class call {
    public static void main(String[] args) {
        Dog object = new Dog();
        System.out.println(object.noLegs);
        System.out.println(object.canBark);
        object.eat();
        object.walk();
    }
}

