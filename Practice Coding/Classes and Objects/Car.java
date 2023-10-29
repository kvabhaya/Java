//Define a class called Car with attributes like make, model, and year. Create an array of Car objects and display their details.
public class Car {
    int year;
    String model;


    public void display() {
        System.out.println(year);
        System.out.println(model);
    }
    public void getValues(int newYear, String newModel){
        year = newYear;
        model = newModel;
    }
}
class Main{
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.getValues(1972,"xp-001");
        car1.display();
    }
}
