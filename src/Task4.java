import java.util.Random;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 10
        int randomNumber = random.nextInt(10) + 1;
        int userGuess = 0;

        // Input validation for the user's guess
        do {
            System.out.print("Guess a number between 1 and 10: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer between 1 and 10.");
                scanner.next(); // Clear the invalid input
            }
            userGuess = scanner.nextInt();
        } while (userGuess < 1 || userGuess > 10);

        // Display the random number
        System.out.println("The random number was: " + randomNumber);

        // Check the user's guess
        if (userGuess == randomNumber) {
            System.out.println("You guessed it! You're on the money!");
        } else if (userGuess < randomNumber) {
            System.out.println("Your guess is too low.");
        } else {
            System.out.println("Your guess is too high.");
        }

        // Close the scanner
        scanner.close();
    }
}

