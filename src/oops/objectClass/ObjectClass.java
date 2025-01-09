package oops.objectClass;

class Car {
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        Car car = new Car("Honda", 2023);
        System.out.println(car);
        System.out.println(car.toString());


    }
}
