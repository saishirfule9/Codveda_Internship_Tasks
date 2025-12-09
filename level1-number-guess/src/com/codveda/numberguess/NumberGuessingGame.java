import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;  
        int attempts = 5;

        System.out.println("Guess the number between 1 and 100.");
        System.out.println("You have " + attempts + " attempts.");

        while (attempts > 0) {
            System.out.print("Enter your guess: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); 
                continue;
            }

            int guess = sc.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }

            if (guess == numberToGuess) {
                System.out.println("Correct! You guessed the number.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low.");
            } else {
                System.out.println("Too high.");
            }

            attempts--;
            System.out.println("Attempts left: " + attempts);
        }

        if (attempts == 0) {
            System.out.println("Game over. The correct number was: " + numberToGuess);
        }
    }
}
