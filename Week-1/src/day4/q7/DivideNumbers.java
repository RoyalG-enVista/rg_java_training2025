package day4.q7;

import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Accepting two integers as input
            System.out.print("Enter the 2 numbers: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            // Perform division and print the result
            int quotient = a / b;
            System.out.println("The quotient of " + a + "/" + b + " = " + quotient);
        } catch (ArithmeticException e) {
            // Catching division by zero
            System.out.println("DivideByZeroException caught");
        } finally {
            // The finally block will always execute
            System.out.println("Inside finally block");
        }

        // Closing the scanner object to prevent resource leak
        scanner.close();
    }
}

