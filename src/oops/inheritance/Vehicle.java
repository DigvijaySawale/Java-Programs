package oops.inheritance;

public class Vehicle {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.gears = 5;
//        car.newGears = 54;  // final variable newGears, so can't be changed/ assigned new values
    }
    int wheelsCount;
    String model;
    int gears = 2;
    final int newGears = 5;  // final variable
    void move() {
        System.out.println("Vehicle is moving");
    }
}
