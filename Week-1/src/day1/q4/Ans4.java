package day1.q4;

import java.util.Scanner;
/*
 * Q4. Create pascal triangle using 2D array (use scanner class)
1
1 2
1 2 3
1 2 3 4
*/

public class Ans4 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of rows
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = scanner.nextInt();  // Read the number of rows

        // Declare a 2D array to store the Pascal's Triangle
        int[][] pascal = new int[rows][];

        // Fill the 2D array with appropriate values
        for (int i = 0; i < rows; i++) {
            // Initialize each row with an array of size i+1
            pascal[i] = new int[i + 1];

            // Fill each row with numbers from 1 to (i+1)
            for (int j = 0; j <= i; j++) {
                pascal[i][j] = j + 1; // Numbers from 1 to (i+1)
            }
        }

        // Print the Pascal's Triangle
        System.out.println("\nPascal's Triangle:");
        for (int i = 0; i < rows; i++) {
            // Print each row of the triangle
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
        // Close the scanner
        scanner.close();
    }
}

