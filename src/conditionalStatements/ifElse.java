package conditionalStatements;

public class ifElse {
    public static void main(String[] args) {

//         if else statement
        int age = 19;
        if(age >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You can't vote");
        }

        // if-else-if statement
        int day = 1;
        if(day == 1) {
            System.out.println("You can go to party");
        } else if(day == 3) {
            System.out.println("Its your day off");
        } else {
            System.out.println("Go to office");
        }

        // nested if-else statements
        int a = 18;
        int b = 14;
        int c = 3;

        //finding the greatest number
        if(a > b) {
            System.out.println("a is bigger than b");
            if(a > c) {
                System.out.println("a is bigger that c");
                System.out.println("a is biggest : " + a);
            } else {
                System.out.println("c is bigger that a");
                System.out.println("c is biggest : " + c);
            }
        } else {
            System.out.println("b is bigger than a");
            if(b > c) {
                System.out.println("b is bigger that c");
                System.out.println("b is biggest : " + b);
            } else {
                System.out.println("c is bigger that b");
                System.out.println("c is biggest : " + c);
            }
        }

        //ternary operator
        int max = a>b ? a : b;
        System.out.println(max);

        max = a>b ? a>c ? a : c  : b>c ? b : c;
        System.out.println(max);
    }
}
