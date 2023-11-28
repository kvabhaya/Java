abstract class Abstract {
    abstract void turnOff(); //Abstract Methode
    void turnOn() {
        System.out.println("Turning ON");
    }
}

class HP extends Abstract {
    void turnOff() {
        System.out.println("Turning Off - HP"); //override must for abstract methode
    }
}

class DELL extends Abstract {
    void turnOff() {
        System.out.println("Turning Off - DELL");
    }
}

class Computer {
    public static void main(String[] args) {
        HP ob = new HP();
        ob.turnOn();
        ob.turnOff();

        DELL ob1 = new DELL();
        ob1.turnOn();
        ob1.turnOff();
    }
}
