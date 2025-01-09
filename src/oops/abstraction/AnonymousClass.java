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
            public void interfaceMethod() {

            }
        };


        // this obj2 is same as obj2 just this is declared using lambda funtion
        SuperInterface obj3 = () -> {

        };

        WalkAble walkAble = (int steps) -> {
            System.out.println(steps);
            return steps;
        };
        walkAble.walk(5);

        WalkAble obj5 = (int steps) -> 2*steps;  // directly returning
        WalkAble obj6 = (steps) -> 2*steps;  //works same as above
        WalkAble obj7 = steps -> 2*steps;  // works same as above
        // above are lambda expression
    }
}

interface WalkAble {
    int walk(int steps);
}

class OuterClass {
    void outerClassMethod() {

    }
}


// anonymous class can be also used with interfaces
@FunctionalInterface
interface SuperInterface {
    void interfaceMethod();
}

