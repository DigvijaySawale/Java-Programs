package loops;

public class DoWhileLoops {
    public static void main(String[] args) {
        int i = 8;

        while(i <= 5) {
            System.out.println("While loop : " +i);
            i++;
        }

        // loop body is executed at least once even condition is false
        do {
            System.out.println("Do While Loop : " + i);
            i++;
        } while(i <= 5);

    }
}
