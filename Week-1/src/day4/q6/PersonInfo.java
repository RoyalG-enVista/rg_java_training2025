package day4.q6;

import java.util.*;

public class PersonInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter the valid age");
            int n1 = sc.nextInt();
            if(n1 < 18 || n1 > 60)
                throw new InvalidAgeException("Enter a valid age between 18 to 60");
        }
        catch (InvalidAgeException e) {

            System.out.println("Invalid Age Exception");
            throw new RuntimeException(e);
        }

        finally {
            System.out.println("Finally block executed");
        }
    }
}