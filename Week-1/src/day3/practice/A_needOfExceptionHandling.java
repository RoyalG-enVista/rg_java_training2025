package day3_4.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_needOfExceptionHandling {
    public static void main(String[] args) {

        while(true){
            Scanner scanner = null;
            try {
                scanner = new Scanner(System.in);
                System.out.println("Enter Numerator");
                int x = scanner.nextInt();

                System.out.println("Enter Denominator");
                int y = scanner.nextInt();

                int result = x / y;
                System.out.println("Ans is : "+result);

            }
            catch (ArithmeticException e){
                System.out.println("Divide by Zero");
            }
            catch (InputMismatchException f){
                System.out.println("Enter Numbers Only");
            }
            break;
        }

    }
}
