package loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // FOR LOOP
        for(int i = 0; i <= 5; i++) {
            System.out.println("Hello World!");
        }


//        Table of number using for loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number for Table: ");
        int num = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(num +" x "+ i +" = "+ num*i);
        }


    }
}
