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


        //LABELLED BREAK AND CONTINUE STATEMENT
        label:
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 5 ; j++) {
                if(j == 3) {
                    continue label;  // skips outer loop iteration
                }
                System.out.print(i +""+ j + "# ");
            }

        }

        anotherLable:
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 5 ; j++) {
                if(j == 3) {
                    break anotherLable;  // breaks entire outer loop
                }
                System.out.print(i +""+ j + "# ");
            }

        }
    }
}
