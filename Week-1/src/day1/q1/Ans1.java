package day1.q1;
//1 to 20 Fibonacci series like below
// 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
public class Ans1 {
        public static void main(String[] args) {
            // First two Fibonacci numbers
            int first = 1;
            int second = 1;

            System.out.println("Fibonacci series from 1 to 20:");

            // Loop to print Fibonacci numbers up to the 20th term
            for (int i = 1; i <= 20; i++) {
                System.out.print(first + " ");

                // Calculate the next Fibonacci number
                int next = first + second;
                first = second;
                second = next;
                
            }
        }
}
