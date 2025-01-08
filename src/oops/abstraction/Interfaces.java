package oops.abstraction;

public class Interfaces {
    public static void main(String[] args) {
//        Animal a1 = new Animal();  // can't do as Animal is intreface/ abstract class
//      Human h1 = new Human;  // can't do as Human is interface

        Pet p1 = new Pet();
        p1.eats();
        p1.walks();
        p1.sings();

        System.out.println(Animal.LEGS);
        System.out.println(Animal.eyes);

    }
}

interface Animal {

    // all fields in interfaces are by default public static final
    public static final int LEGS = 4;
    int eyes = 2;

    // here methods in interfaces are abstract by default
    void eats();
    void sings();

//    void screams() ;  // gives error
    default void screams() {
        System.out.println("Animal Screams");
    }
}

interface Human {
    void walks();
    void sings();
}

class Monkey implements Animal {

    @Override
    public void eats() {
        System.out.println("Monkey is Eating");
    }

    @Override
    public void sings() {

    }
}

// here we are inheriting from both Animal and Human as Animal and Human both are interfaces
class Pet implements Animal, Human {
    @Override
    public void eats() {
        System.out.println("Pet Eats");
    }

    @Override
    public void walks() {
        System.out.println("Pet Walks");
    }

    @Override
    // this method is present in both interfaces
    // but since we don't instantiate these methods so no ambiguity comes here
    public void sings() {
        System.out.println("Method sings is present in both interfaces");
    }
}