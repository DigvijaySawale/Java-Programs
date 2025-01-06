package oops;

public class MethodOverloading {
    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.greeting();
        obj.greeting("Ram");
    }
}

class Greet {

    void greeting() {
        System.out.println("Hello, Good Morning!");
    }

    // added parameters to method with same name
    void greeting(String name) {
        System.out.println("Hello " +name+ ", Good Morning!");
    }
}
