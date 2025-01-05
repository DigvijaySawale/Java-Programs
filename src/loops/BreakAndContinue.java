package loops;

public class BreakAndContinue {
    public static void main(String[] args) {

        // BREAK STATEMENT;
        for (int i = 0; i <= 20; i+=2) {
            System.out.println(i);
            if(i > 10) {
                System.out.println("Condition Matched");
                break;  // breaking/ quiting loop
            }
        }

        //CONTINUE STATEMENT;
        for (int i = 0; i <= 5; i++) {
            if(i == 3) {
                System.out.println("Condition Matched");
                continue;  // skipping iteration 
            }
            System.out.println(i);
        }
    }
}
