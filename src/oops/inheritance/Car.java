package oops.inheritance;

public class Car extends Vehicle {
    String color;
    void move() {
        System.out.println("Car is moving");
        System.out.println(this); // current instance or current object
        System.out.println(this.model + " is moving");

        // super keyword
        super.move(); // points to instance of immediate parent of class for which current object belongs
    }
    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheelsCount = 4;
        obj.model = "Swift";

        obj.move(); // here parent class method is overridden
    }
}
