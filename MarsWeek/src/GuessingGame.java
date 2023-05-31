import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame{
    public GuessingGame() {
        // Scanner initialization
        Scanner scan = new Scanner(System.in);

        // Greeting and saving user's name
        System.out.println("Welcome to the Guessing Game, where you will guess my number from 1 - 100.\nWhat is your name?");
        String name = scan.nextLine();

        // Random initialization and declaration of computer's random number
        Random random = new Random();
        int mysteryNumber = random.nextInt(100);

        // Declaration of the rest of variable(s) needed that will be used outside the loop
        int userGuess = -1;
        int userGuessCount = 1;
        boolean anotherGuess = false;

        while (userGuess != mysteryNumber) {
            // For flavor, the first guess should be indicated as such.
            if (userGuessCount == 1 && anotherGuess) {
                System.out.println("\nPlease make your first guess again.");
            } else if (userGuessCount == 1) {
                System.out.println("\nPlease make your first guess.");
            } else if (userGuessCount > 1 && anotherGuess) {
                System.out.println("\nPlease make another guess again.");
            } else {
                System.out.println("\nPlease make another guess.");
            }

            // Reset the variable to false in case if the user makes a valid guess.
            anotherGuess = false;

            // A try/catch for the users' input.
            try {
                userGuess = scan.nextInt();

                // Checks to see if the number entered is within the range indicated by the game.
                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("\nYour guess cannot be less than 1 or greater than 100.");
                    anotherGuess = true;
                    continue;
                }
            }

            // We use 'InputMismatchException' to check if what we got wasn't an integer.
            catch (InputMismatchException e) {
                String string = scan.next();
                System.out.println("Error: " + e + "\nAKA, it means you didn't enter a number, " + name + ".");
                anotherGuess = true;
                continue;
            }

            // Checks to see where the guess is in comparison to the mystery number.
            // No need to check if the user's guess is correct as the while loop will break itself when it is correct.
            // But since it is asked in the MVP to have one, it is below. Otherwise, I would have just done the winning response outside the while loop.
            if (userGuess > mysteryNumber) {
                System.out.println("\nYour guess is too high.");
            } else if (userGuess < mysteryNumber) {
                System.out.println("\nYour guess is too low.");
            } else {
                System.out.println("\nCongratulations " + name + "!\nIt took you " + userGuessCount + " tries to guess " + mysteryNumber + ".");
                break;
            }

            // If the game hasn't ended, the count increases.
            userGuessCount++;
        }
    }
}
