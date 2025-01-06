package oops;

public class MainClass {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.age = 8;
        d1.colour = "black";
        d1.name = "Roxy";
        System.out.println(d1.name);
        d1.bark();
//        d1.walk();

        Dog d2 = new Dog();
        d2.name = "Tommy";
        d2.walk();

    }
}

class Dog {
    String  name;  // properties of Dog class
    int age;
    String colour;

    // behaviour of class
    // function is a behaviour

    void bark() {
//        System.out.println("Dog is barking");
        System.out.println(name + " is barking"); // setting
    }

    void  walk() {
//        System.out.println("Dog is Walking");
        System.out.println(name + " is walking");  // setting
    }

}
