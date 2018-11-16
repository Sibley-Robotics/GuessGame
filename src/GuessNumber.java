
import java.util.Scanner;
import java.util.Random;


public class GuessNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random ran = new Random();

        int guessesTaken = 0;
        int guess = 999;
        int target = ran.nextInt(20) + 1;
        System.out.println("target = " + target);

        while (guessesTaken < 6) {
            guessesTaken = guessesTaken + 1;
            System.out.println("Take a guess.");
            guess =  reader.nextInt();

            if (guess < target) {
                System.out.println(guess + " is too low");
            } else
            if (guess > target) {
                System.out.println(guess + " is too high");
            } else {
                System.out.println(guess + " is correct!!");
                System.out.println("You got it in " + guessesTaken + " guesses.");
                System.exit(0);
                // This is edited by Victoria
            }
        }
        System.out.println("You have had  " + guessesTaken + "guesses.");
        System.out.println("The number was:  " + target);
        // Hello

        System.exit( 1);


    }
}
