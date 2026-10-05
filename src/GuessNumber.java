import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int secret = new Random().nextInt(100) + 1; // 1 to 100
        int tries = 0;

        System.out.println("I'm thinking of a number between 1 and 100.");

        while (true) {
            System.out.print("Your guess: ");
            int guess = in.nextInt();
            tries++;

            if (guess < secret) {
                System.out.println("Too low!");
            } else if (guess > secret) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You got it in " + tries + " tries.");
                break;
            }
        }
        in.close();
    }
}
