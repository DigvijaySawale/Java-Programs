package oops.abstraction;

public class InnerClass {
    // inner class
    class Toy {
        int price;
    }

    static class Doll {
        int price;
    }

    public static void main(String[] args) {
//        Toy toy = new Toy();  // can't do as Toy is non static class and inner class
//        toy.price = 43;

        Toy toy = new InnerClass(). new Toy();
        toy.price = 45;

        // OR
        InnerClass obj = new InnerClass();
        Toy toy2 = obj.new Toy();
        toy2.price = 34;

        // since doll is static class we can use as follows
        Doll barbie = new InnerClass.Doll();
        barbie.price = 43;
    }
}
