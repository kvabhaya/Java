//Create a class called Person with attributes like name and age. Create an instance of the Person class and set its attributes.

public class Person {
    String name;
    int age;

    // Instance method to display person's information
    public void display() {
        System.out.println(name);
        System.out.println(age);
    }

    public void setValues(String newName, int newAge) {
        name = newName;
        age = newAge;
    }
}

class Main {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "Kokila";
        one.age = 25;
        one.display();

        Person two = new Person();
        two.setValues("Olong", 24);
        two.display();
    }
}

