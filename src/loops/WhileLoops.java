package loops;
import java.util.Scanner;
public class WhileLoops {
    public static void main(String[] args) {
        int i = 0;

        while(i < 5) {
            System.out.println(i);
            i++;
        }

        //loop termination based on user input
        Scanner sc = new Scanner(System.in);
        boolean hasLearnt = false;

        while(!hasLearnt) {
            System.out.println("Went to school, tried to learn");
            System.out.println("Did you Learnt? ");
            hasLearnt = sc.nextBoolean();
        }
    }
}
