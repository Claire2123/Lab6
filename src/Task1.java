import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new
                Scanner(System.in);
        double celsius =0;
        boolean validInput = false;


        do {
            System.out.print("Enter tempreture in celsius");
            if ((scanner.hasNextDouble())) {
                celsius=
                        scanner.nextDouble();
                validInput = true;

            } else {
                System.out.println("invalid input. Please enter a valid number.");

            }
        }while (!validInput);


        double fahrenheit =
                (celsius * 9/5) +32;
        System.out.println("Equivalent tempreture i n Fahrenheit:" + fahrenheit);



    }}