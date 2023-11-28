interface InterfaceSample {
    //can't use normal methods.only can use abstract methods.
    abstract void call();
    abstract void talk();
}

interface Mother {
    abstract void call();
    abstract void talk();
}

//not extends it's implements
class Son implements InterfaceSample,Mother { 
    //for interface public must
    public void call() {
        System.out.println("Calling");
    }
    public void talk() {
        System.out.println("Talking");
    }

    public static void main(String[] args) {
        Son ob = new Son();
        ob.call();
        ob.talk();
    }
}
