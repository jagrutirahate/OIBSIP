
import java.util.Random;
import java.util.Scanner;



public class NumberGuessingGame {

    public static void main(String[] args) {
        playNumberGuessingGame();
    }

    public static void playNumberGuessingGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxNumber = 100; // You can change this to adjust the range of the numbers
        int secretNumber = random.nextInt(maxNumber) + 1;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have picked a number between 1 and " + maxNumber + ".");
        System.out.println("Can you guess what it is?");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number " + secretNumber + " in " + attempts + " attempts!");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low. Try again!");
            } else {
                System.out.println("Too high. Try again!");
            }
        }

        scanner.close();
    }
}
