package conditionalStatements;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you day number: ");
        int day = sc.nextInt();

        switch (day) {
            case 1 :
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("No day");
                break;
        }


        int i = 2;

        switch (i) {
            case 1: case 2:
                System.out.println("hi");
                break;
            default:
                System.out.println("nope");
        }


    }
}
