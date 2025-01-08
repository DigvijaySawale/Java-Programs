package oops.abstraction;

public class AnonymousClass {
    public static void main(String[] args) {

        //regular inherited class
//        class Innerclass extends OuterClass {
//
//        }

        OuterClass obj = new OuterClass() {
            // here obj in part of inner class
            void innerClassMethod() {

            }

            public void outerClassMethod() {
                //overriding the method from parent class
            }
        };

        SuperInterface obj2 = new SuperInterface() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
    }
}


class OuterClass {
    void outerClassMethod() {

    }
}


// anonclass can be also used with interfaces
interface SuperInterface {

}