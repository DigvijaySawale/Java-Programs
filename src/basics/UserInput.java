package basics;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Your number is " + num);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = a + b;
        System.out.println(result);

        sc.close();   // closing the scanner
    }
}
