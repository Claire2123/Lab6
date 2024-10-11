import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gallons = 0;
        double milesPerGallon = 0;
        double pricePerGallon = 0;

        // Input for the number of gallons of gas in the tank
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
            gallons = scanner.nextDouble();
        } while (gallons < 0);

        // Input for the fuel efficiency in miles per gallon
        do {
            System.out.print("Enter the fuel efficiency (miles per gallon): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
            milesPerGallon = scanner.nextDouble();
        } while (milesPerGallon <= 0);

        // Input for the price of gas per gallon
        do {
            System.out.print("Enter the price of gas per gallon: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
            pricePerGallon = scanner.nextDouble();
        } while (pricePerGallon < 0);

        // Calculations
        double costToDrive100Miles = (100 / milesPerGallon) * pricePerGallon;
        double maxDistance = gallons * milesPerGallon;

        // Output results
        System.out.printf("The cost to drive 100 miles is: $%.2f%n", costToDrive100Miles);
        System.out.printf("With a full tank, the car can go: %.2f miles%n", maxDistance);

        // Close the scanner
        scanner.close();
    }
}
