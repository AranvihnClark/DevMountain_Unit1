import java.util.Random;
import java.util.Scanner;

public class GuessingGame{
    public static void main(String[] args) {
        // Scanner initialization
        Scanner scan = new Scanner(System.in);

        // Greeting and saving user's name
        System.out.println("Welcome to the Guessing Game.\nWhat is your name?");
        String name = scan.nextLine();

        // Random initialization and declaration of computer's random number
        Random random = new Random();
        int mysteryNumber = random.nextInt(100);

        // Declaration of the rest of variables needed that will be used outside the loop
        int userGuess = -1;
        int userGuessCount = 0;

        while (userGuess != mysteryNumber) {
            if (userGuessCount == 0) {
                System.out.println("Please make your first guess.");
            } else {
                System.out.println("Please make your next guess.");
            }

            // A try/catch for the users' input.
            try {
                userGuess = scan.nextInt();
                if (userGuess > mysteryNumber) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Your guess is too low.");
                }
            }
            catch (Exception e) {
                System.out.println("Error: " + e);
            }
            userGuessCount++;
        }
        // No need to check if the user's guess is correct as the while loop will break itself when it is correct.
        System.out.println("\nCongratulations " + name + "!\nIt took you " + userGuessCount + " tries to guess " + mysteryNumber + ".");
    }
}
