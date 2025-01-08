package oops.abstraction;

public class Abstraction {
    public static void main(String[] args) {

//            Vehicle v1 = new Vehicle();  // cant create instance as vehicle is an abstract class

        Car c1 = new Car();
        c1.accelerating();
        c1.wheels(4);
        c1.honks();
    }
}

// abstract class which cannot be instantiated
abstract class Vehicle{

    // below is abstract method hence cant have body
    abstract void accelerating();

    abstract int wheels(int wheels) ;

    //non-abstract method so it have body
    void honks() {
        System.out.println("Vehicle Honks");
    }
}

class Car extends Vehicle {
    @Override
    // here accelerating is an abstract method os it is must it to have its implementations in subclass
    void accelerating() {
        System.out.println("Car is accelerating");
    }

    int wheels(int wheels) {
        System.out.println("Car has " + wheels + " wheels");
        return wheels;
    }
}
