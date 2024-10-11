import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = 0;
        double height = 0;

        // Input for the width of the rectangle
        do {
            System.out.print("Enter the width of the rectangle: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a positive number.");
                scanner.next(); // Clear the invalid input
            }
            width = scanner.nextDouble();
        } while (width <= 0);

        // Input for the height of the rectangle
        do {
            System.out.print("Enter the height of the rectangle: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a positive number.");
                scanner.next(); // Clear the invalid input
            }
            height = scanner.nextDouble();
        } while (height <= 0);

        // Calculations
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        // Output results
        System.out.printf("The area of the rectangle is: %.2f%n", area);
        System.out.printf("The perimeter of the rectangle is: %.2f%n", perimeter);
        System.out.printf("The length of the diagonal is: %.2f%n", diagonal);

        // Close the scanner
        scanner.close();
    }
}
